package com.job.onboardingapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.job.onboardingapp.adapter.SliderAdapter;

/**
 * Created by JOB on 3/11/2018.
 */

public class MainActivity extends AppCompatActivity {

    ViewPager mSlideViewPager;
    LinearLayout dotsLayout;

    PagerAdapter slideAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(slideAdapter);

    }
}
