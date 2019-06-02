package com.example.spidertask1_final;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Dimension;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.spidertask1_final.R;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Final extends AppCompatActivity {

    RelativeLayout rl;
    ImageView t,t2,t5,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        rl = (RelativeLayout) findViewById(R.id.rl);

        t = (ImageView) findViewById(R.id.t);
        t2 = (ImageView) findViewById(R.id.t3);
        t3 = (ImageView) findViewById(R.id.t4);
        t4 = (ImageView) findViewById(R.id.t5);
        t5 = (ImageView) findViewById(R.id.t1);

    }

    int a=0;
    int b=0,c=0,d=0,e=0;

    public void grav(View v) {
        Intent intent=getIntent();
        int p = intent.getIntExtra(MainActivity.EXTRA_NUMBER,1);

        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
        int height = metrics.heightPixels;
        int i = rl.getHeight();

        long z=(1000*i)/p;

        int rand = ThreadLocalRandom.current().nextInt(1, 6);

        if(rand==1) {
            a++;
            if (a % 2 == 1) {
                t.animate().translationY(i-200);
                t.animate().setDuration(z);
            } else {
                t.animate().translationY(0);
                t.animate().setDuration(z);
            }
        }
        if(rand==2) {
            b++;
            if (b % 2 == 1) {
                t2.animate().translationY(i-200);
                t2.animate().setDuration(z);
            } else {
                t2.animate().translationY(0);
                t2.animate().setDuration(z);
            }
        }

        if(rand==3) {
            c++;
            if (c % 2 == 1) {
                t3.animate().translationY(i-200);
                t3.animate().setDuration(z);
            } else {
                t3.animate().translationY(0);
                t3.animate().setDuration(z);
            }
        }
        if(rand==4) {
            d++;
            if (d % 2 == 1) {
                t4.animate().translationY(i-200);
                t4.animate().setDuration(z);
            } else {
                t4.animate().translationY(0);
                t4.animate().setDuration(z);
            }
        }
        if(rand==5) {
            e++;
            if (e % 2 == 1) {
                t5.animate().translationY(i-200);
                t5.animate().setDuration(z);

            } else {
                t5.animate().translationY(0);
                t5.animate().setDuration(z);
            }
        }
    }

    public void quit (View view){

        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}
