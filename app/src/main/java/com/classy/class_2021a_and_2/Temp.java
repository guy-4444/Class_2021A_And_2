package com.classy.class_2021a_and_2;

public class Temp {


    /*
ScheduledFuture<?> scheduledFuture;

    public void  start() {
        scheduledFuture = new ScheduledThreadPoolExecutor(5).scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        increaseCounter();
                    }
                });
            }
        }, 0L, 2000,  TimeUnit.MILLISECONDS);
    }

    private void stop() {
        scheduledFuture.cancel(false);
    }
     */


    /*
private Timer carousalTimer;

    public void  start() {
        carousalTimer = new Timer();
        carousalTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        increaseCounter();
                    }
                });
            }
        }, 0, 2000);
    }


    public void  stop() {
        carousalTimer.cancel();
    }
     */

    /*
        private Handler handler = new Handler();

    private Runnable runnable = new Runnable() {
        public void run() {
            handler.postDelayed(runnable, 2000);
            increaseCounter();
        }
    };

    private void start() {
        handler.postDelayed(runnable, 2000);
    }

    private void stop() {
        handler.removeCallbacks(runnable);
    }
     */
}
