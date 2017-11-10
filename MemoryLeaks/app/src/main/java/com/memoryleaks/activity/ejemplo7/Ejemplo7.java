package com.memoryleaks.activity.ejemplo7;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.memoryleaks.R;

public class Ejemplo7 extends AppCompatActivity {

    private TextView textView;

    private final Handler mLeakyHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Log.e("Ejemplo7", "handle message");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo7);
        initUI();

        // Post a message and delay its execution for 10 seconds.
        mLeakyHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText("Ejemplo7 - Pasaron 10 segundos ");
                Log.e("Ejemplo7", "in run()");
            }
        }, 1000 * 10);
    }

    private void initUI(){
        textView = (TextView) findViewById(R.id.ejemplo6_textview);
    }
}
