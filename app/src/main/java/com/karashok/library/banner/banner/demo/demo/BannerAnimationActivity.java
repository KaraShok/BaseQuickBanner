package com.karashok.library.banner.banner.demo.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.karashok.library.banner.App;
import com.karashok.library.banner.R;
import com.karashok.library.banner.banner.Banner;
import com.karashok.library.banner.banner.demo.SampleAdapter;
import com.karashok.library.banner.banner.demo.loader.GlideImageLoader;
import com.karashok.library.banner.banner.listener.OnBannerListener;
import com.karashok.library.banner.banner.transformer.AccordionTransformer;
import com.karashok.library.banner.banner.transformer.BackgroundToForegroundTransformer;
import com.karashok.library.banner.banner.transformer.CubeInTransformer;
import com.karashok.library.banner.banner.transformer.CubeOutTransformer;
import com.karashok.library.banner.banner.transformer.DefaultTransformer;
import com.karashok.library.banner.banner.transformer.DepthPageTransformer;
import com.karashok.library.banner.banner.transformer.FlipHorizontalTransformer;
import com.karashok.library.banner.banner.transformer.FlipVerticalTransformer;
import com.karashok.library.banner.banner.transformer.ForegroundToBackgroundTransformer;
import com.karashok.library.banner.banner.transformer.RotateDownTransformer;
import com.karashok.library.banner.banner.transformer.RotateUpTransformer;
import com.karashok.library.banner.banner.transformer.ScaleInOutTransformer;
import com.karashok.library.banner.banner.transformer.StackTransformer;
import com.karashok.library.banner.banner.transformer.TabletTransformer;
import com.karashok.library.banner.banner.transformer.ZoomInTransformer;
import com.karashok.library.banner.banner.transformer.ZoomOutSlideTransformer;
import com.karashok.library.banner.banner.transformer.ZoomOutTranformer;

import java.util.ArrayList;
import java.util.List;

public class BannerAnimationActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, OnBannerListener {
    Banner banner;
    List<Class<? extends ViewPager.PageTransformer>> transformers=new ArrayList<>();
    public void initData(){
        transformers.add(DefaultTransformer.class);
        transformers.add(AccordionTransformer.class);
        transformers.add(BackgroundToForegroundTransformer.class);
        transformers.add(ForegroundToBackgroundTransformer.class);
        transformers.add(CubeInTransformer.class);//兼容问题，慎用
        transformers.add(CubeOutTransformer.class);
        transformers.add(DepthPageTransformer.class);
        transformers.add(FlipHorizontalTransformer.class);
        transformers.add(FlipVerticalTransformer.class);
        transformers.add(RotateDownTransformer.class);
        transformers.add(RotateUpTransformer.class);
        transformers.add(ScaleInOutTransformer.class);
        transformers.add(StackTransformer.class);
        transformers.add(TabletTransformer.class);
        transformers.add(ZoomInTransformer.class);
        transformers.add(ZoomOutTranformer.class);
        transformers.add(ZoomOutSlideTransformer.class);
    }
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_animation);
        initData();
        banner = (Banner) findViewById(R.id.banner);
        ListView listView = (ListView) findViewById(R.id.list);
        String[] data = getResources().getStringArray(R.array.anim);
        listView.setAdapter(new SampleAdapter(this, data));
        listView.setOnItemClickListener(this);

        banner.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .setOnBannerListener(this)
                .start();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        banner.setBannerAnimation(transformers.get(position));
    }

    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getApplicationContext(),"你点击了："+position,Toast.LENGTH_SHORT).show();
    }
}
