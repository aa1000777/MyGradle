package com.cjc.mygradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str =   BuildConfig.API_HOST;
        TextView txt1 = (TextView) findViewById(R.id.txt1);
        txt1.setText(str);
    }
}
