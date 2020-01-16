package com.karashok.library.banner.banner.demo.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.karashok.library.banner.App;
import com.karashok.library.banner.R;
import com.karashok.library.banner.banner.Banner;
import com.karashok.library.banner.banner.BannerConfig;
import com.karashok.library.banner.banner.demo.loader.GlideImageLoader;


public class CustomBannerActivity extends AppCompatActivity {
    Banner banner1,banner2,banner3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_banner);
        banner1 = (Banner) findViewById(R.id.banner1);
        banner2 = (Banner) findViewById(R.id.banner2);
        banner3 = (Banner) findViewById(R.id.banner3);

        banner1.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .start();

        banner2.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .start();

        banner3.setImages(App.images)
                .setBannerTitles(App.titles)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE)
                .setImageLoader(new GlideImageLoader())
                .start();
    }
}
