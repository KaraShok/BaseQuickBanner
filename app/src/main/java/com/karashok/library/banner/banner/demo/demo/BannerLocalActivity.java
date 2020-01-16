package com.karashok.library.banner.banner.demo.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.karashok.library.banner.R;
import com.karashok.library.banner.banner.Banner;
import com.karashok.library.banner.banner.demo.loader.GlideImageLoader;

import java.util.ArrayList;
import java.util.List;

public class BannerLocalActivity extends AppCompatActivity {

    Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_local);
        initView();
    }

    private void initView() {
        banner = (Banner) findViewById(R.id.banner);
        //本地图片数据（资源文件）
        List<Integer> list=new ArrayList<>();
        list.add(R.drawable.b1);
        list.add(R.drawable.b2);
        list.add(R.drawable.b3);



        banner.setImages(list)
                .setImageLoader(new GlideImageLoader())
                .start();
    }
}
