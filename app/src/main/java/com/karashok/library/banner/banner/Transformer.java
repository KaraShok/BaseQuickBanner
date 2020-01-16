package com.karashok.library.banner.banner;


import androidx.viewpager.widget.ViewPager.PageTransformer;

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

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
