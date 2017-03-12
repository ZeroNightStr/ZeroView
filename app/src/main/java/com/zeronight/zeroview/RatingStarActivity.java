package com.zeronight.zeroview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.fanqie.zeroratingstart.ZeroRatingBar;

/**
 * Created by ZeroNight on 17/3/12.
 */
public class RatingStarActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingstar);

        ZeroRatingBar ratingstar = (ZeroRatingBar) findViewById(R.id.ratingstar);
        ratingstar.isClick(true);


    }
}
