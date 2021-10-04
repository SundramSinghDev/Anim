package com.sundram.androidanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sundram.androidanimation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Animation fade_in_anim, fade_out_anim, blinking_anim, zoom_in_anim,
            zoom_out_anim, rotate_anim, move_anim, slide_up_anim, slide_down_anim,
            bounce_anim, sequential_anim;
    ActivityMainBinding binding;
    private static final String TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        gettingAnimation();
        binding.setHandlers(this);
    }

    private void gettingAnimation() {
        fade_in_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        fade_out_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
        blinking_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blinking);
        zoom_in_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoomin);
        zoom_out_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoomout);
        move_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
        slide_down_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slidedown);
        slide_up_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.sldieup);
        bounce_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
        sequential_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.sequential);
        rotate_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
    }

    public void OnFadeInBtnClick(View view) {
        binding.fadeAnimationTv.startAnimation(fade_in_anim);
    }

    public void OnFadeOutBtnClick(View view) {
        binding.fadeOutAnimationTv.startAnimation(fade_out_anim);
    }

    public void OnBlinkingBtnClick(View view) {
        binding.blinkingAnimationTv.startAnimation(blinking_anim);
    }

    public void OnZoomInBtnClick(View view) {
        binding.zoomInAnimationTv.startAnimation(zoom_in_anim);
    }

    public void OnZoomOutBtnClick(View view) {
        binding.zoomOutAnimationTv.startAnimation(zoom_out_anim);
    }

    public void OnRotateBtnClick(View view) {
        binding.rotateAnimationTv.startAnimation(rotate_anim);
    }

    public void OnMoveBtnClick(View view) {
        binding.moveAnimationTv.startAnimation(move_anim);
    }

    public void OnSlideUpBtnClick(View view) {
        binding.slideUpAnimationTv.startAnimation(slide_up_anim);
    }

    public void OnSlideDownBtnClick(View view) {
        binding.slideDownAnimationTv.startAnimation(slide_down_anim);
    }

    public void OnBounceBtnClick(View view) {
        binding.bounceAnimationTv.startAnimation(bounce_anim);
    }

    public void OnSequentialBtnClick(View view) {
        binding.sequentialAnimationTv.startAnimation(sequential_anim);
    }


}