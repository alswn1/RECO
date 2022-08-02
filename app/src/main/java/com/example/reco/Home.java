package com.example.reco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.home);

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
    }
}