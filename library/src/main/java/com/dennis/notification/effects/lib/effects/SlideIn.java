package com.dennis.notification.effects.lib.effects;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

public class SlideIn extends BaseEffect {

    @Override
    protected void setInAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationX", -view.getWidth(), -10,-20,-5,-10,0).setDuration(mDuration)

        );
    }

    @Override
    protected void setOutAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationX", 0,-10,view.getWidth()).setDuration(mDuration)
        );
    }

    @Override
    protected long getAnimDuration(long duration) {
        return duration;
    }
}
