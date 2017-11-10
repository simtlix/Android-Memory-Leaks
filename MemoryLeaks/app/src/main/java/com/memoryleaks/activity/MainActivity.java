package com.memoryleaks.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.memoryleaks.R;
import com.memoryleaks.activity.ejemplo1.Ejemplo1;
import com.memoryleaks.activity.ejemplo2.Ejemplo2;
import com.memoryleaks.activity.ejemplo3.Ejemplo3;
import com.memoryleaks.activity.ejemplo4.Ejemplo4;
import com.memoryleaks.activity.ejemplo5.Ejemplo5;
import com.memoryleaks.activity.ejemplo6.Ejemplo6;
import com.memoryleaks.activity.ejemplo7.Ejemplo7;
import com.memoryleaks.activity.ejemplo8.Ejemplo8;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI(){
        Button ejemplo1Activity = (Button) findViewById(R.id.ejemplo1_activity);
        ejemplo1Activity.setOnClickListener(this);

        Button ejemplo2Activity = (Button) findViewById(R.id.ejemplo2_activity);
        ejemplo2Activity.setOnClickListener(this);

        Button ejemplo3Activity = (Button) findViewById(R.id.ejemplo3_activity);
        ejemplo3Activity.setOnClickListener(this);

        Button ejemplo4Activity = (Button) findViewById(R.id.ejemplo4_activity);
        ejemplo4Activity.setOnClickListener(this);

        Button ejemplo5Activity = (Button) findViewById(R.id.ejemplo5_activity);
        ejemplo5Activity.setOnClickListener(this);

        Button ejemplo6Activity = (Button) findViewById(R.id.ejemplo6_activity);
        ejemplo6Activity.setOnClickListener(this);

        Button ejemplo7Activity = (Button) findViewById(R.id.ejemplo7_activity);
        ejemplo7Activity.setOnClickListener(this);

        Button ejemplo8Activity = (Button) findViewById(R.id.ejemplo8_activity);
        ejemplo8Activity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.ejemplo1_activity:
                intent = new Intent(this, Ejemplo1.class);
                startActivity(intent);
                break;
            case R.id.ejemplo2_activity:
                intent= new Intent(this, Ejemplo2.class);
                startActivity(intent);
                break;
            case R.id.ejemplo3_activity:
                intent= new Intent(this, Ejemplo3.class);
                startActivity(intent);
                break;
            case R.id.ejemplo4_activity:
                intent= new Intent(this, Ejemplo4.class);
                startActivity(intent);
                break;
            case R.id.ejemplo5_activity:
                intent= new Intent(this, Ejemplo5.class);
                startActivity(intent);
                break;
            case R.id.ejemplo6_activity:
                intent= new Intent(this, Ejemplo6.class);
                startActivity(intent);
                break;
            case R.id.ejemplo7_activity:
                intent= new Intent(this, Ejemplo7.class);
//                intent= new Intent(this, Ejemplo7Fixed.class);
                startActivity(intent);
                break;
            case R.id.ejemplo8_activity:
                intent= new Intent(this, Ejemplo8.class);
//                intent= new Intent(this, Ejemplo8Fixed.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
