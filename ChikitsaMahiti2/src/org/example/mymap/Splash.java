package org.example.mymap;

import org.example.mymap.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;


public class Splash extends Activity {
    protected boolean _active = true;
    protected int _splashTime = 3000;
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
      
        final Intent i1 = new Intent(this, HomeScreen.class);
        
        // thread for displaying the SplashScreen
        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while(_active && (waited < _splashTime)) {
                        sleep(100);
                        if(_active) {
                            waited += 100;
                        }
                    }
                } catch(InterruptedException e) {
                    // do nothing
                } finally {
                    finish();
                    
        			startActivity(i1);
                    stop();
                }
            }
        };
        splashTread.start();
    }
    
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            _active = false;
        }
        return true;
    }
}