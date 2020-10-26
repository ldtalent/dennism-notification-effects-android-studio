package com.dennis.notification.effects.lib.effects;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

public class Jelly extends BaseEffect {

    @Override
    protected void setInAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "scaleX", .3f, .5f, .9f,.8f,.9f,1).setDuration(mDuration),
                ObjectAnimator.ofFloat(view,"scaleY",.3f, .5f, .8f,.9f,.8f,1).setDuration(mDuration),
                ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(mDuration*3/2)
        );
    }

    @Override
    protected void setOutAnimation(View view) {
        getAnimatorSet().playTogether(
//                ObjectAnimator.ofFloat(view, "scaleX", 1,.9f,.8f,.9f,.5f,0).setDuration(mDuration),
//                ObjectAnimator.ofFloat(view,"scaleY",1,.8f,.9f,.8f,.5f,0).setDuration(mDuration),
                ObjectAnimator.ofFloat(view, "alpha", 1, 0).setDuration(mDuration*2/3)
        );
    }

    @Override
    protected long getAnimDuration(long duration) {
        return duration;
    }
}
