package com.example.reco;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RecodeMain extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.recode_main);

        ImageButton btn_home = (ImageButton) findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
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

        ImageButton btn_level = (ImageButton) findViewById(R.id.btn_level);
        btn_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RecodeLevel.class);
                startActivity(intent);
            }
        });

        ImageButton btn_event = (ImageButton) findViewById(R.id.btn_event);
        btn_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Event.class);
                startActivity(intent);
            }
        });

        ImageButton btn_quiz = (ImageButton) findViewById(R.id.btn_quiz);
        btn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizMain.class);
                startActivity(intent);
            }
        });

    }
}