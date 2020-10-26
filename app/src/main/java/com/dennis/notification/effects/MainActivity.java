package com.dennis.notification.effects;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.dennis.notification.effects.lib.Configuration;
import com.dennis.notification.effects.lib.Effects;
import com.dennis.notification.effects.lib.NiftyNotificationView;
import com.gitonway.lee.niftynotification.R;

public class MainActivity extends Activity {
    private Effects effect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNotify(View v){

        String msg="Today we’d like to share a couple of simple styles and effects for android notifications.";

        switch (v.getId()){
            case R.id.scale:effect=Effects.scale;break;
            case R.id.thumbSlider:effect=Effects.thumbSlider;break;
            case R.id.jelly:effect=Effects.jelly;break;
            case R.id.slidein:effect=Effects.slideIn;break;
            case R.id.flip:effect=Effects.flip;break;
            case R.id.slideOnTop:effect=Effects.slideOnTop;break;
            case R.id.standard:effect=Effects.standard;break;
        }


        NiftyNotificationView.build(this,msg, effect,R.id.mLyout)
                .setIcon(R.drawable.lion)         //You must call this method if you use ThumbSlider effect
                .show();

    }

}
