package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.logging.Handler;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 2568;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

       Thread thread = new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   sleep(2000);
                   Intent i =new Intent(MainActivity.this,second_page.class);
                   startActivity(i);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       });
       thread.start();
    }
}