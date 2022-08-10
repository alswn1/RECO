package com.example.reco;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.reco.database.PIC_VALIDATION;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class GarbageCamera extends AppCompatActivity {
    
    private ImageView imageView;
    private ProgressBar progressBar;
    private final DatabaseReference root = FirebaseDatabase.getInstance().getReference("Image");
    private final StorageReference reference = FirebaseStorage.getInstance().getReference();
    
    private Uri imageUri;

    Bitmap bitmap;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garbage_camera);

        // 컴포넌트 객체에 담기
        Button uploadBtn = findViewById(R.id.upload_btn);
        progressBar = findViewById(R.id.progress_View);
        imageView = findViewById(R.id.image_view);
        
        // 프로그래스바 숨기기
        progressBar.setVisibility(View.INVISIBLE);
        
        // 이미지 클릭 이벤트
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent galleryIntent = new Intent();
                galleryIntent.setAction(Intent.ACTION_GET_CONTENT);
                galleryIntent.setType("image/");
                activityResult.launch(galleryIntent);
            }
        });
        
        // 업로드버튼 클릭 이벤트
        uploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 선택한 이미지가 있다면
                if (imageUri != null) {
                    uploadToFirebase(imageUri);
                } else {
                    Toast.makeText(GarbageCamera.this, "사진을 선택해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    } // onCreate


    // 사진 가져오기
    ActivityResultLauncher<Intent> activityResult = registerForActivityResult(
        new ActivityResultContracts.StartActivityForResult(),
        new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK && result.getData() != null){
                    imageUri = result.getData().getData();

                    imageView.setImageURI(imageUri);
               }
            }
        }
    );

    // Firebase에 이미지 업로드
    private void uploadToFirebase(Uri uri) {
        StorageReference fileRef = reference.child(System.currentTimeMillis() + "." + getFileExtension(uri));
        fileRef.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                fileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        // 이미지 모델에 담기
                        PIC_VALIDATION PIC_VALIDATION = new PIC_VALIDATION(uri.toString());
                        //Toast.makeText(GarbageCamera.this, "이미지 모델에 담기 성공", Toast.LENGTH_SHORT).show();

                        // 키로 아이디 생성
                        String modelId = root.push().getKey();
                        //Toast.makeText(GarbageCamera.this, "키로 아이디 생성 성공", Toast.LENGTH_SHORT).show();

                        // 데이터 넣기
                        root.child(modelId).setValue(PIC_VALIDATION);
                        //Toast.makeText(GarbageCamera.this, "데이터 넣기 성공", Toast.LENGTH_SHORT).show();

                        // 프로그래스바 숨김
                        progressBar.setVisibility(View.INVISIBLE);
                        Toast.makeText(GarbageCamera.this, "업로드 성공", Toast.LENGTH_SHORT).show();
                        imageView.setImageResource(R.drawable.ic_add_photo);
                    }
                });
            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                // 프로그래스바 보여주기
                progressBar.setVisibility(View.VISIBLE);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                // 프로그래스바 숨김
                progressBar.setVisibility(View.INVISIBLE);
                //Log.e("로그","업로드 실패 로그");
                Toast.makeText(GarbageCamera.this, "업로드 실패", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // 파일타입 가져오기
    private String getFileExtension(Uri uri) {
         ContentResolver cr = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();

        return mime.getExtensionFromMimeType(cr.getType(uri));
    }
}













