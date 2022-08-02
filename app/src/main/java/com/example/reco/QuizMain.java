package com.example.reco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizMain extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.quiz_main);

        ImageButton btn_home = (ImageButton) findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
            }
        });

        ImageButton btn_quiz_o = (ImageButton) findViewById(R.id.btn_quiz_o);
        btn_quiz_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizFail.class);
                startActivity(intent);
            }
        });

        ImageButton btn_quiz_x = (ImageButton) findViewById(R.id.btn_quiz_x);
        btn_quiz_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizGetPoint.class);
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

        ImageButton btn_back = (ImageButton) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RecodeMain.class);
                startActivity(intent);
            }
        });
    }
}