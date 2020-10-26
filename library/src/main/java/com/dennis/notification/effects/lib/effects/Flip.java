package com.dennis.notification.effects.lib.effects;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.view.ViewHelper;

public class Flip extends BaseEffect {
    long s = mDuration,
         e =mDuration;
    @Override
    protected void setInAnimation(View view) {
        ViewHelper.setPivotX(view, view.getWidth()/2);
        ViewHelper.setPivotY(view, 0);
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "rotationX",-90,0).setDuration(s),
                ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(s*3/2)

        );
    }

    @Override
    protected void setOutAnimation(View view) {
        ViewHelper.setPivotX(view, view.getWidth()/2);
        ViewHelper.setPivotY(view, 0);
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "rotationX",0, -90).setDuration(e),
                ObjectAnimator.ofFloat(view, "alpha", 1, 0).setDuration(e * 3 / 2)

        );
    }

    @Override
    protected long getAnimDuration(long duration) {
        return duration;
    }
}
