package com.example.reco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Event extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.event);

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
