package com.example.mahmoud.home__fix;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout pagerdot;
    private slid_adapter slidadapter;
    private TextView[]dots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager  = (ViewPager)findViewById(R.id.viewpager);
        pagerdot= (LinearLayout)findViewById(R.id.pagerdot);
        slidadapter =new slid_adapter(this);
        viewPager.setAdapter(slidadapter);
        adddots(0);
        viewPager.addOnPageChangeListener(viewpager);

    }
    ///addd dotts
    public void adddots(int postion){
        dots=new TextView[5];
        pagerdot.removeAllViews();
        for (int i =0 ; i <dots.length;i++)
        {
            dots[i]= new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.transcoloe));
            pagerdot.addView(dots[i]);


        }
        if(dots.length>0)
            dots[postion].setTextColor(getResources().getColor(R.color.white));
    }

    ///////shap of dotts شكل الدوت
    ViewPager.OnPageChangeListener viewpager = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            adddots(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }

    };
    public void go_to_home(View view) {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
        finish();
    }


}
