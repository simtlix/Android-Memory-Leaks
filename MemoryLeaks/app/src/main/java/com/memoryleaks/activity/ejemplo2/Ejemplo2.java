package com.memoryleaks.activity.ejemplo2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.memoryleaks.R;

public class Ejemplo2 extends AppCompatActivity {

    // FIXME: static reference to the activity will leak the activity.
    // To fix it, set it null onDestroy or use weak reference
    private static Activity myActivity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo2);

        if (myActivity == null){
            myActivity = this;
        }
    }
}
