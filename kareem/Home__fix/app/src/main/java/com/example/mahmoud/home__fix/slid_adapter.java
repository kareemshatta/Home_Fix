package com.example.mahmoud.home__fix;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by mahmoud on 3/2/2018.
 */

public class slid_adapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public slid_adapter(Context context) {
        this.context = context;
    }

    //// array of image

    public int[] slid_images={
            R.drawable.im1,
            R.drawable.im2,
            R.drawable.im3,
            R.drawable.im2,
            R.drawable.im1,

    };
    //// array of image
    public String[] slid_head={
            "start tour",
            "next",
            "next",
            "next",
            "start",

    };


    /////arry of description
      public String[] slid_description={
            "Home fix is the market palce where you can meet the most valuable fixer in the town.",
            "Home fix comes to you FREE and always will be.",
            "as home fix cares to your satisfaction , feel free to PREVIEW &RATE  your overall experience.",
            "after calling the fixer a report will appear to you , feel free to fill it. ",
            "Orders are placed after filling in all the required details ."


    };


    @Override
    public int getCount() {
        return slid_images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==(RelativeLayout)object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.slid_layout,container,false);
        ImageView im = (ImageView)view.findViewById(R.id.slid_image);
        TextView txt1 = (TextView)view.findViewById(R.id.textView);
        TextView txt2 = (TextView)view.findViewById(R.id.textView2);
        im.setImageResource(slid_images[position]);
        txt1.setText(slid_head[position]);
        txt2.setText(slid_description[position]);
        container.addView(view);

return  view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
