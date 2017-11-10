package com.memoryleaks.activity.ejemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.memoryleaks.R;

public class Ejemplo1 extends AppCompatActivity {

    //FIXME: static view will leak the activity. To fix it, make it non-static
    private static TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo1);
        initUI();
    }

    private void initUI(){
        textView = (TextView) findViewById(R.id.ejemplo1_textview);
        textView.setText("TextView con Referencia Estática!");
    }
}
