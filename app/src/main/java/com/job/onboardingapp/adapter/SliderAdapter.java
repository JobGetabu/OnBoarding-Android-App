package com.job.onboardingapp.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.job.onboardingapp.R;

/**
 * Created by JOB on 3/12/2018.
 */

public class SliderAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){

        this.context = context;
    }

    //icons arrays
    public int[] slider_icons = {
            R.drawable.eat_icon,
            R.drawable.sleep_icon,
            R.drawable.code_icon
    };

    //heading arrays
    public String[] slider_heading ={
            "Eat",
            "Enjoy",
            "Rate"
    };

    //description
    public String[] slider_description={
            "Whether you’re looking for a new pizzeria, a great coffee restaurant nearby,"+
                    " a new hotel, or the best chapati in town",

            "Friendly Eats is your guide to finding the perfect places to eat,"+
            "drink, relax, and play.",

            " From storied steak houses and the nation’s hottest contemporary restaurants"+
                    " to revered roadside diners, barbecue joints and burger bars, FriendlyEats has got you covered "

    };

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_layout,container,false);

        //instanciate all the res
        ImageView slideimageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDesc = (TextView) view.findViewById(R.id.slide_description);

        slideimageView.setImageResource(slider_icons[position]);
        slideHeading.setText(slider_heading[position]);
        slideDesc.setText(slider_description[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
