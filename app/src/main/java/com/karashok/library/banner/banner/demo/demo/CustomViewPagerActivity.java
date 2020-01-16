package com.karashok.library.banner.banner.demo.demo;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.karashok.library.banner.App;
import com.karashok.library.banner.R;
import com.karashok.library.banner.banner.Banner;
import com.karashok.library.banner.banner.demo.loader.GlideImageLoader;
import com.karashok.library.banner.banner.listener.OnBannerListener;


public class CustomViewPagerActivity extends AppCompatActivity implements OnBannerListener {
    Banner banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_pager);

        banner = (Banner) findViewById(R.id.banner);
        banner.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, App.H / 4));
        //简单使用
        banner.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .setOnBannerListener(this)
                .start();
    }

    @Override
    public void OnBannerClick(int position) {

    }

    //如果你需要考虑更好的体验，可以这么操作
    @Override
    protected void onStart() {
        super.onStart();
        //开始轮播
        banner.startAutoPlay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //结束轮播
        banner.stopAutoPlay();
    }
}
