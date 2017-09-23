package com.m520it.baisi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SplashActivity extends AppCompatActivity {

    private ImageView mSplashDefaultIv;
    private ImageView mSplashLogo;
    private RelativeLayout mSplash;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        initData();
        initAnim();
        initListenner();
    }

    private void initListenner() {
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                ActivityUtils.startNewActivity(SplashActivity.this,LoginActivity.class,true);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    private void initAnim() {
        animation = AnimationUtils.loadAnimation(this, R.anim.splash);
        mSplash.startAnimation(animation);
    }

    private void initData() {

    }

    private void initView() {
        mSplashDefaultIv = (ImageView) findViewById(R.id.splash_default_iv);
        mSplashLogo = (ImageView) findViewById(R.id.splash_logo);
        mSplash = (RelativeLayout) findViewById(R.id.splash);
    }
}
