package com.memoryleaks.activity.ejemplo8;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.memoryleaks.R;

public class Ejemplo8Fixed extends AppCompatActivity {

    private DoNothingTask doNothingTask = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo8);
        initUI();
        doNothingTask.execute();
    }

    private void initUI(){
        TextView textView = (TextView) findViewById(R.id.ejemplo7_textview);
        doNothingTask = new DoNothingTask(textView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // FIXED: should cancel the task in activity onDestroy()
        doNothingTask.cancel(true);
    }

    // FIXED: use static class instead of inner class. Static class does not have reference to the
    // containing activity class
    private static class DoNothingTask extends AsyncTask<Void, Void, Void> {

        private TextView textView;

        DoNothingTask(TextView textView) {
            this.textView = textView;
        }

        @Override
        protected Void doInBackground(Void... params) {
            SystemClock.sleep(10000);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            textView.setText("Pasaron 10 segundos...");
        }
    }
}
