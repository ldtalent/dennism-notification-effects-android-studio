package com.dennis.notification.effects.lib;

import com.dennis.notification.effects.lib.effects.BaseEffect;
import com.dennis.notification.effects.lib.effects.Flip;
import com.dennis.notification.effects.lib.effects.Jelly;
import com.dennis.notification.effects.lib.effects.Scale;
import com.dennis.notification.effects.lib.effects.SlideIn;
import com.dennis.notification.effects.lib.effects.SlideOnTop;
import com.dennis.notification.effects.lib.effects.Standard;
import com.dennis.notification.effects.lib.effects.ThumbSlider;

public enum Effects {
    standard(Standard.class),
    slideOnTop(SlideOnTop.class),
    flip(Flip.class),
    slideIn(SlideIn.class),
    jelly(Jelly.class),
    thumbSlider(ThumbSlider.class),
    scale(Scale.class);


    private Class<? extends BaseEffect> effectsClazz;

    private Effects(Class<? extends BaseEffect> mclass) {
        effectsClazz = mclass;
    }

    public BaseEffect getAnimator() {
        BaseEffect bEffects=null;
        try {
            bEffects = effectsClazz.newInstance();
        } catch (ClassCastException e) {
            throw new Error("Can not init animatorClazz instance");
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            throw new Error("Can not init animatorClazz instance");
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            throw new Error("Can not init animatorClazz instance");
        }
        return bEffects;
    }
}
