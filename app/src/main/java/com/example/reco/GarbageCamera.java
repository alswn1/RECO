package com.example.reco;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;

import java.io.IOException;

public class GarbageCamera extends AppCompatActivity {

    Button button_capture, button_copy;
    TextView textview_data;
    Bitmap bitmap;
    private static final int REQUEST_CAMERA_CODE = 100;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_capture = findViewById(R.id.button_capture);
        button_copy = findViewById(R.id.button_copy);
        textview_data = findViewById(R.id.text_data);

        if (ContextCompat.checkSelfPermission(GarbageCamera.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(GarbageCamera.this, new String[]{
                    Manifest.permission.CAMERA
            }, REQUEST_CAMERA_CODE);
        }

        button_capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CropImage.activity().setGuidelines(CropImageView.Guidelines.ON).start(GarbageCamera.this);
            }
        });

        button_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String scanned_text = textview_data.getText().toString();
                copyToClipBoard(scanned_text);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQEUST_CODE){
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (requestCode == RESULT_OK){
                Uri resultUri = result.getUri();
                try {
                    bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), resultUri);
                    getTextFromImage(bitmap);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    // 사진 찍기
//    public void takePicture(){
//        Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//
//        if (imageTakeIntent.resolveActivity(getPackageManager()) != null){
//            startActivityForResult(imageTakeIntent, REQUEST_CAMERA_CODE);
//        }
//    }

    // 결과값 가져오기
    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == REQUEST_CAMERA_CODE && resultCode == RESULT_OK) {
//            Bundle extras = data.getExtras();
//            Uri resultUri = result.getUri();
//            bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), resultUri);
//        }
//    }

    private void getTextFromImage(Bitmap bitmap){
        TextRecognizer recognizer = new TextRecognizer.Builder(this).build();
        if (recognizer.isOperational()){
            Toast.makeText(GarbageCamera.this, "Error Occurred!!", Toast.LENGTH_SHORT);
        }
        else{
            Frame frame = new Frame.Builder().setBitmap(bitmap).build();
            SparseArray<TextBlock> textBlockSparseArray = recognizer.detect(frame);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i=0; i < textBlockSparseArray.size(); i++){
                TextBlock textBlock = textBlockSparseArray.valueAt(i);
                stringBuilder.append(textBlock.getValue());
                stringBuilder.append("\n");
            }
            textview_data.setText(stringBuilder.toString());
            button_capture.setText("Retake");
            button_copy.setVisibility(View.VISIBLE);
        }
    }
    private void copyToClipBoard(String text){
        ClipboardManager clipBoard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Copied data", text);
        clipBoard.setPrimaryClip(clip);
        Toast.makeText(GarbageCamera.this, "Copied to clipboard", Toast.LENGTH_SHORT);
    }
}