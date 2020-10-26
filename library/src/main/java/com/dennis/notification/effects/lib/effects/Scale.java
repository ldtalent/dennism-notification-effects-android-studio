package com.dennis.notification.effects.lib.effects;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

public class Scale extends BaseEffect {

    @Override
    protected void setInAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationY", -view.getHeight()/2, 0).setDuration(mDuration),
                ObjectAnimator.ofFloat(view, "scaleX", .3f, .5f, 1).setDuration(mDuration),
                ObjectAnimator.ofFloat(view,"scaleY",.3f,.5f,1,1.1f,1).setDuration(mDuration),
                ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(mDuration*3/2)

        );
    }

    @Override
    protected void setOutAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationY", 0, -view.getHeight()/2).setDuration(mDuration),
                ObjectAnimator.ofFloat(view, "scaleX", 1, .5f, 0).setDuration(mDuration),
                ObjectAnimator.ofFloat(view,"scaleY",1,.5f,0).setDuration(mDuration),
                ObjectAnimator.ofFloat(view, "alpha", 1, 0).setDuration(mDuration*3/2)

        );
    }

    @Override
    protected long getAnimDuration(long duration) {
        return duration;
    }
}
