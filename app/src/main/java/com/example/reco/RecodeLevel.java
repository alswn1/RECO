package com.example.reco;

import android.os.Bundle;
import android.view.Window;

import androidx.fragment.app.FragmentActivity;

public class RecodeLevel extends FragmentActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.recode_level);
    }
}