package com.dennis.notification.effects.lib.effects;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

public class Standard extends BaseEffect{
    @Override
    protected void setInAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationY", -view.getHeight(), 0).setDuration(mDuration)

        );
    }

    @Override
    protected void setOutAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationY",0, -view.getHeight()).setDuration(mDuration)

        );
    }

    @Override
    protected long getAnimDuration(long duration) {
        return duration;
    }
}
