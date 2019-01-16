package com.internal.administrator.internalmarkcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.reg);
        e2=(EditText)findViewById(R.id.sub1);
        e3=(EditText)findViewById(R.id.mark1);
        e4=(EditText)findViewById(R.id.obt1);
        e5=(EditText)findViewById(R.id.sub2);
        e6=(EditText)findViewById(R.id.mark2);
        e7=(EditText)findViewById(R.id.obt2);
        


    }
}
