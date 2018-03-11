package com.job.onboardingapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.job.onboardingapp.adapter.SliderAdapter;

/**
 * Created by JOB on 3/11/2018.
 */

public class MainActivity extends AppCompatActivity {

    ViewPager mSlideViewPager;
    LinearLayout dotsLayout;
    TextView mDots[];

    Button prevBtn;
    Button nextBtn;

    PagerAdapter slideAdapter;
    int currentPage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        dotsLayout = (LinearLayout) findViewById(R.id.dotsLayout);


        slideAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(slideAdapter);

        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(changeListener);
    }

    public void addDotsIndicator(int position) {

        mDots = new TextView[3];
        dotsLayout.removeAllViews();

        for (int j = 0; j < mDots.length; j++) {
            mDots[j] = new TextView(this);
            mDots[j].setText(Html.fromHtml("&8226"));
            mDots[j].setTextSize(35);
            mDots[j].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            dotsLayout.addView(mDots[j]);
        }

        if (mDots.length > 0) {
            mDots[position].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsIndicator(position);

            currentPage = position;
            if ( position == 0){


            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}
