package com.classy.class_2021a_and_2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private static final int DELAY = 500;
    private TextView main_LBL_counter;

    private int counter = 0;

    private String name = "Guyyyyy1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LBL_counter = findViewById(R.id.main_LBL_counter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        start();
    }
    @Override
    protected void onStop() {
        super.onStop();
        stop();
    }

    private void increaseCounter() {
        Log.d("pttt", "Counter= " + ++counter);
        main_LBL_counter.setText("" + counter);

        playSound(R.raw.snd_dino_bird);
    }

    private MediaPlayer mp;
    private void playSound(int rawSound) {
        if (mp != null) {
            try {
                mp.reset();
                mp.release();
            } catch (Exception ex) { }
        }

        mp = MediaPlayer.create(this, rawSound);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
                mp.release();
                mp = null;
            }
        });
        mp.start();
    }

    private Handler handler = new Handler();

    private Runnable runnable = new Runnable() {
        public void run() {
            handler.postDelayed(runnable, DELAY);
            increaseCounter();
        }
    };

    private void start() {
        handler.postDelayed(runnable, DELAY);
    }

    private void stop() {
        handler.removeCallbacks(runnable);
    }

}