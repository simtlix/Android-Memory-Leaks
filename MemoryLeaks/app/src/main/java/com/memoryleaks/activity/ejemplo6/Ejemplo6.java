package com.memoryleaks.activity.ejemplo6;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import com.memoryleaks.R;

public class Ejemplo6 extends AppCompatActivity {

//    private MyThread myThread = new MyThread();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo6);

        new MyThread().start();
    }


    // FIXME: non-static anonymous classes hold an implicit reference to their enclosing class.
    // Fix is to make it static. Also, close thread in activity onDestroy() to avoid thread leak.
    private class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                SystemClock.sleep(1000);
            }
        }
    }

    //FIXME: Uncomment
//    @Override
//    protected void onDestroy() {
//        // FIXED: kill the thread in activity onDestroy
//        myThread.interrupt();
//        super.onDestroy();
//    }
//
//    // FIXED: make it static. So it does not have referenced to the containing activity class
//    private static class MyThread extends Thread {
//        @Override
//        public void run() {
//            // FIXED: check interrupted before the next loop
//            while (!isInterrupted()) {
//                SystemClock.sleep(1000);
//            }
//        }
//    }
}
