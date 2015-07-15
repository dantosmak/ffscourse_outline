package com.tmaklabs.smart.cacsaffs;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

//created by smartmaklabs
public class SplashActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.activity_splash);
        Thread logoTimer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    Intent navintent = new Intent("android.intent.action.NAV");
                    startActivity(navintent);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally{
                    finish();

                }
            }

        };
        logoTimer.start();

    }


}