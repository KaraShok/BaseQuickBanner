package com.karashok.library.banner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.karashok.library.banner.banner.demo.BannerActivity;
import com.karashok.library.banner.ultraviewpager.demo.UPVDemoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vId = v.getId();
                if (vId == R.id.intent_banner_aty_btn){
                    startActivity(new Intent(MainActivity.this, BannerActivity.class));
                }else if (vId == R.id.intent_upv_aty_btn){
                    startActivity(new Intent(MainActivity.this, UPVDemoActivity.class));
                }
            }
        };
        findViewById(R.id.intent_banner_aty_btn)
                .setOnClickListener(clickListener);

        findViewById(R.id.intent_upv_aty_btn)
                .setOnClickListener(clickListener);
    }
}
