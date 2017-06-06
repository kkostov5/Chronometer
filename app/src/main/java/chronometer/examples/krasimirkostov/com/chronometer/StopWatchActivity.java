package chronometer.examples.krasimirkostov.com.chronometer;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TabHost;
import android.widget.TextView;

public class StopWatchActivity extends Activity {

    private TextView timeText;
    private TextView et_laps;
    private ScrollView sv_Laps;
    private Button btnStart;
    private Button btnLap;
    private Button btnStop;
    private TabHost tabHost;

    private int laps;
    private Context context;
    private Chronometer chrono;
    private Thread threadChrono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);


//
//        et_laps = (TextView) findViewById(R.id.et_laps);
//        timeText = (TextView) findViewById(R.id.displayTime);
//        sv_Laps = (ScrollView) findViewById(R.id.sv_laps);
//        btnStart = (Button) findViewById(R.id.btn_start);
//        btnLap = (Button) findViewById(R.id.btn_lap);
//        btnStop = (Button) findViewById(R.id.btn_stop);
//
//        btnStop.setEnabled(false);
//        context = this;
//
//
//        btnStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Start button is pressed
//                if(chrono == null)
//                {
//                    chrono = new Chronometer(context);
//                    threadChrono = new Thread(chrono);
//                    threadChrono.start();
//                    chrono.start();
//                    laps = 1;
//                    btnStop.setEnabled(true);
//                }
//            }
//        });
//
//        btnStop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(chrono != null)
//                {
//                    chrono.stop();
//                    threadChrono.interrupt();
//                    threadChrono = null;
//                    chrono = null;
//                    et_laps.setText("");
//                }
//            }
//        });
//
//        btnLap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(chrono != null)
//                {
//                    et_laps.append("LAP "+String.valueOf(laps)+" : " + String.valueOf(timeText.getText()) + "\n");
//
//                    sv_Laps.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            sv_Laps.smoothScrollBy(0,et_laps.getBottom());
//                        }
//                    });
//                    laps++;
//
//                }
//            }
//        });

    }

//    public void updateTimerText(final String time)
//    {
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                timeText.setText(time);
//            }
//        });
//    }

}
