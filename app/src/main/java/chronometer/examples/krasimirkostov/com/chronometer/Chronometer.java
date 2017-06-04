package chronometer.examples.krasimirkostov.com.chronometer;

import android.content.Context;

/**
 * Created by Krasi on 03/06/2017.
 */

public class Chronometer implements Runnable {

    private Context context;
    private long startTime;
    private boolean isRunning;

    public static final long MILIS_TO_MINUTES = 60000;
    public static final long MILIS_TO_HOURS = 3600000;

    public Chronometer(Context context) {
        this.context = context;
    }

    public void start()
    {
        startTime = System.currentTimeMillis();

        isRunning = true;
    }

    public void stop()
    {
        isRunning = false;
    }

    @Override
    public void run() {

        while(isRunning)
        {
            long since = System.currentTimeMillis() - startTime;

            int seconds = (int) ((since / 1000) % 60);
            int minutes = (int) ((since / MILIS_TO_MINUTES) % 60);
            int hours = (int) ((since / MILIS_TO_HOURS) % 24);
            int milis = (int) (since % 1000);

            ((MainActivity)context).updateTimerText(String.format("%02d:%02d:%02d:%03d",hours,minutes,seconds,milis));

            try
            {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
