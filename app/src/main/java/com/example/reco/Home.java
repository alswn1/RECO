package com.example.reco;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.DatabaseErrorHandler;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.DatabaseMetaData;

public class Home extends AppCompatActivity {
    //private DatabaseReference mDatabase;
    //mDatabase = FirebaseDatabase.getInstance().getReference();

    //String name;
    //String loginID;
    //String loginSort;

    //TextView pointCount = null;
    //int count = 0;
    //TextView mTextViewResult;
    //private AlertDialog dialog;

    //private static String IP_ADDRESS = "서버 IP 주소 ";
    //private static String TAG = "phppoint";

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.home);

        //Intent intent = getIntent();
        //카페 이름 확인
        //name = intent.getExtras().getString("name");
        //로그인 아이디 확인
        //loginID = intent.getExtras().getString("loginID");
        //회원가입시 선택한 저장 번호 확인(점주인지 고객인지 분류)
        //loginSort = intent.getExtras().getString("loginSort");


        //mTextViewResult = (TextView) findViewById(R.id.user_point);
        //pointCount = (EditText) findViewById(R.id.user_point);

        //mTextViewResult.setMovementMethod(new ScrollingMovementMethod());

        //class InsertData extends AsyncTask<String, Void, String> {
        //ProgressDialog progressDialog;

        //@Override
        //protected void onPreExecute() {
        //super.onPreExecute();

        //progressDialog = ProgressDialog.show(PointActivity.this,
        //"Please Wait", null, true, true);
        //}

        //@Override
        //protected void onPostExecute(String result) {
        //  super.onPostExecute(result);

        //progressDialog.dismiss();
        // mTextViewResult.setText(result);
        // Log.d(TAG, "POST response  - " + result);
        // }

        //@Override
        //protected String doInBackground(String... params) {
        //String name = (String) params[1];
        //String userID = (String) params[2];
        //String stamp = (String) params[3];

        //String serverURL = (String) params[0];
        //String postParameters = "name=" + name + "&userID=" + userID + "&stamp=" + stamp;

        //try {
        //URL url = new URL(serverURL);
        //HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        //httpURLConnection.setReadTimeout(5000);
        //httpURLConnection.setConnectTimeout(5000);
        //httpURLConnection.setRequestMethod("POST");
        //httpURLConnection.connect();

        //OutputStream outputStream = httpURLConnection.getOutputStream();
        //outputStream.write(postParameters.getBytes("UTF-8"));
        //outputStream.flush();
        //outputStream.close();

        //int responseStatusCode = httpURLConnection.getResponseCode();
        //Log.d(TAG, "POST response code - " + responseStatusCode);

        //InputStream inputStream;
        //if (responseStatusCode == HttpURLConnection.HTTP_OK) {
        //  inputStream = httpURLConnection.getInputStream();
        //} else {
        //  inputStream = httpURLConnection.getErrorStream();
        //}

        //InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //StringBuilder sb = new StringBuilder();
        //String line = null;

        //while ((line = bufferedReader.readLine()) != null) {
        //    sb.append(line);
        //}
        //bufferedReader.close();
        // return sb.toString();
        //} catch (Exception e) {
        //Log.d(TAG, "InsertData: Error ", e);
        //return new String("Error: " + e.getMessage());
        //}

        ImageButton btn_home = (ImageButton) findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
            }
        });

        ImageButton btn_recode1 = (ImageButton) findViewById(R.id.btn_recode1);
        btn_recode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RecodeMain.class);
                startActivity(intent);
            }
        });

        ImageButton btn_recode2 = (ImageButton) findViewById(R.id.btn_recode2);
        btn_recode2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RecodeMain.class);
                startActivity(intent);
            }
        });

        //ImageButton btn_settings = (ImageButton) findViewById(R.id.btn_settings);
        //btn_settings.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //Intent intent = new Intent(getApplicationContext(), Settings.class);
        //startActivity(intent);
        //}
        //});

        //ImageButton btn_alert = (ImageButton) findViewById(R.id.btn_alert);
        //btn_alert.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //Intent intent = new Intent(getApplicationContext(), ALERT.class);
        //startActivity(intent);
        //}
        //});

        //ImageButton btn_map = (ImageButton) findViewById(R.id.btn_map);
        //btn_map.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //Intent intent = new Intent(getApplicationContext(), Map.class);
        //startActivity(intent);
        //}
        //});

        //ImageButton btn_coupon = (ImageButton) findViewById(R.id.btn_coupon);
        //btn_coupon.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //Intent intent = new Intent(getApplicationContext(), Coupon.class);
        //startActivity(intent);
        //}
        //});

        //ImageButton btn_mypage = (ImageButton) findViewById(R.id.btn_mypage);
        //btn_mypage.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //Intent intent = new Intent(getApplicationContext(), Mypage.class);
        //startActivity(intent);
        //}
        //});
    //}
    }
}