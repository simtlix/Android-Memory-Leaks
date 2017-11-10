package com.memoryleaks.activity.ejemplo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.memoryleaks.R;

public class Ejemplo4 extends AppCompatActivity {

    //FIXME: To fix it, make it non-static
    private static InternalClass internalClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo4);

        if (internalClass == null) {
            internalClass = new InternalClass();
        }
    }

    private class InternalClass {
    }
}
