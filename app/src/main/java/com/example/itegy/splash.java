package com.example.itegy;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // statuse bar hide start
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            Window w=getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            // statuse bar hide end
            // add handler start
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(com.example.itegy.splash.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            },3000);


            //add handler end
        }
    }
}
