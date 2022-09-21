package com.example.myapplication.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.transition.Slide;
import android.view.Gravity;
import android.view.animation.DecelerateInterpolator;

public class TransitionFunc {
    public static void setTransitions(Activity activ){
        if (Build.VERSION.SDK_INT > 20) {
            Slide enter = new Slide();
            Slide exit = new Slide();
            exit.setSlideEdge(Gravity.LEFT);
            enter.setSlideEdge(Gravity.RIGHT);
            enter.setDuration(400);
            exit.setDuration(400);
            enter.setInterpolator(new DecelerateInterpolator());
            exit.setInterpolator(new DecelerateInterpolator());
            activ.getWindow().setExitTransition(enter);
            activ.getWindow().setEnterTransition(exit);
        }
    }

}
