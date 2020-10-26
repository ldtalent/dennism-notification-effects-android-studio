package com.dennis.notification.effects.lib.effects;

import android.view.View;

import com.dennis.notification.effects.lib.Configuration;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.view.ViewHelper;

public abstract class BaseEffect {

    public static final int DURATION;

    static {
        DURATION = Configuration.ANIM_DURATION;
    }
    public long mDuration=DURATION ;

    private AnimatorSet mAnimatorSet;
    {
        mAnimatorSet = new AnimatorSet();
    }

    protected abstract void setInAnimation(View view);

    protected abstract void setOutAnimation(View view);

    protected abstract long getAnimDuration(long duration);

    public void in(View view) {
        reset(view);
        setInAnimation(view);
        mAnimatorSet.start();
    }

    public void out(View view) {
        reset(view);
        setOutAnimation(view);
        mAnimatorSet.start();
    }
    public void reset(View view) {
        ViewHelper.setPivotX(view, view.getWidth() / 2.0f);
        ViewHelper.setPivotY(view, view.getHeight() / 2.0f);
    }
    public BaseEffect setDuration(long duration) {
        this.mDuration = duration;
        return this;
    }
    public long getDuration(){
        return getAnimDuration(mDuration);
    }

    public AnimatorSet getAnimatorSet() {
        return mAnimatorSet;
    }

}
