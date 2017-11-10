package com.memoryleaks.activity.ejemplo7;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.memoryleaks.R;

public class Ejemplo7Fixed extends AppCompatActivity {

    private Handler mLeakyHandler = new MyHandler();
    private MyRunnable myRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo7);
        initUI();
        // Post a message and delay its execution for 10 seconds.
        mLeakyHandler.postDelayed(myRunnable, 1000 * 10);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // FIXED: remove callback in activity onDestroy
        mLeakyHandler.removeCallbacks(myRunnable);
    }

    // FIXED: use static class instead of inner class. static class does not have reference to the containing activity
    private static class MyRunnable implements Runnable {

        private TextView textView;

        MyRunnable(TextView textView) {
            this.textView = textView;
        }

        @Override
        public void run() {
            textView.setText("Ejemplo7 - Fixed - Pasaron 10 segundos");
            Log.e("Ejemplo7Fixed", "in run()");
        }
    }

    // FIXED: use static class instead of inner class. static class does not have reference to the containing activity
    private static class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            Log.e("Ejemplo7Fixed", "handle message");
        }
    }

    private void initUI(){
        TextView textView = (TextView) findViewById(R.id.ejemplo6_textview);
        myRunnable = new MyRunnable(textView);
    }
}
