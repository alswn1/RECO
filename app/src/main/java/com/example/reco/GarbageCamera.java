package com.example.reco;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.googlecode.tesseract.android.TessBaseAPI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class GarbageCamera extends AppCompatActivity {

    TessBaseAPI tessBaseAPI;
    String dataPath = "";
    String langData = "kor+eng";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garbage_camera);

        try {
            dataPath = getFilesDir() + "/tesseract/";
            checkFile(new File(dataPath + "tessdata/"), "kor");
            checkFile(new File(dataPath + "tessdata/"), "eng");

            tessBaseAPI = new TessBaseAPI();
            tessBaseAPI.init(dataPath, langData);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private void checkFile(File dir, String lang) {
        Log.d("---", "---");
        Log.d("//===========//","================================================");
        Log.d("","\n"+"[A_CameraOcr > checkFile() 메소드 : OCR 인식 위한 파일 존재 확인 실시]");
        Log.d("","\n"+"[언어 파일 : "+String.valueOf(lang)+"]");
        Log.d("//===========//","================================================");
        Log.d("---","---");
        try {
            if(!dir.exists() && dir.mkdirs()){
                copyFiles(lang);
            }

            if(dir.exists()){
                String dataFilePath = dataPath + "/tessdata/" + lang + ".traineddata";
                File dataFile = new File(dataFilePath);
                if(!dataFile.exists()){
                    copyFiles(lang);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void copyFiles(String lang) {
        Log.d("---","---");
        Log.d("//===========//","================================================");
        Log.d("","\n"+"[A_CameraOcr > copyFiles() 메소드 : OCR 인식 위한 언어 파일 복사 실시]");
        Log.d("","\n"+"[언어 파일 : "+String.valueOf(lang)+"]");
        Log.d("//===========//","================================================");
        Log.d("---","---");
        try {
            String filePath = dataPath + "/tessdata/" + lang + ".traineddata";

            AssetManager assetManager = getAssets();

            InputStream inputStream = assetManager.open("tessdata/" + lang + ".traineddata");
            OutputStream outputStream = new FileOutputStream(filePath);

            byte[] buffer = new byte[1024];
            int read;
            while((read = inputStream.read(buffer)) != -1){
                outputStream.write(buffer, 0, read);
            }
            outputStream.flush();
            outputStream.close();
            inputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getOcrConvert(ImageView image){
        Log.d("---","---");
        Log.d("//===========//","================================================");
        Log.d("","\n"+"[A_CameraOcr > getOcrConvert() 메소드 : OCR 인식 수행 실시]");
        Log.d("//===========//","================================================");
        Log.d("---","---");
        try {
            //TODO [drawable 리소스를 비트맵으로 가져오기]
            //Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.icon_resource);

            //TODO [이미지 뷰의 리소스를 비트맵으로 가져오기]
            Bitmap bitmap = ((BitmapDrawable) image.getDrawable()).getBitmap();

            //TODO [OCR 인식 수행]
            tessBaseAPI.setImage(bitmap);
            String result = String.valueOf(tessBaseAPI.getUTF8Text());

            //TODO [Alert 팝업창 호출 실시]
            getAlertDialog("[OCR] 사진 인식 결과",
                    String.valueOf(result),
                    "확인", "", "");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void getAlertDialog(String header, String content, String ok, String no, String normal) {
        //TODO 타이틀 및 내용 표시
        final String Tittle = header;
        final String Message = content;

        //TODO 버튼 이름 정의
        String buttonNo = no;
        String buttonYes = ok;
        String buttonNature = normal;

        //TODO AlertDialog 팝업창 생성
        new AlertDialog.Builder(GarbageCamera.this)
                .setTitle(Tittle) //[팝업창 타이틀 지정]
                //.setIcon(R.drawable.tk_app_icon) //[팝업창 아이콘 지정]
                .setMessage(Message) //[팝업창 내용 지정]
                .setCancelable(false) //[외부 레이아웃 클릭시도 팝업창이 사라지지않게 설정]
                .setPositiveButton(buttonYes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                    }
                })
                .setNegativeButton(buttonNo, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                    }
                })
                .setNeutralButton(buttonNature, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                    }
                })
                .show();
    }

}