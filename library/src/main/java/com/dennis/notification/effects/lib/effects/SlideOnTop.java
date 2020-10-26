package com.dennis.notification.effects.lib.effects;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

public class SlideOnTop extends BaseEffect{

    @Override
    protected void setInAnimation(View view) {

        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationY", -view.getWidth(), -10, -20, -5, -10, 0).setDuration(mDuration)
        );
    }

    @Override
    protected void setOutAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationY", 0,-10,-5,-view.getWidth()).setDuration(mDuration)
        );
    }

    @Override
    protected long getAnimDuration(long duration) {
        return duration;
    }
}
