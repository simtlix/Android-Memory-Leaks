package com.memoryleaks.activity.ejemplo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.memoryleaks.R;

public class Ejemplo3 extends AppCompatActivity {

    private SingletonClass singletonClass = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo3);
        singletonClass = SingletonClass.getInstance(this);
    }


    //FIXME: Remove the activity reference from the singleton
//    @Override
//    protected void onDestroy() {
//        singletonClass.unregister(this);
//        super.onDestroy();
//    }
}
