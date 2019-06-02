package com.example.spidertask1_final;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "com.spidertask1_final.application.spidertask1_final.EXTRA_NUMBER";

    EditText et;
    Button btn;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.t1);
        btn = (Button) findViewById(R.id.btn);
        t=(TextView) findViewById(R.id.errortext);
    }

    public void speedset(View view) {
        int i = 0;

        if (!(et.getText().toString().equals("")))
            i = Integer.parseInt(et.getText().toString());

        if (i == 0) {
            t.setText("INVALID INPUT. Enter again.");
            et.setText("");
        }
        else {
            Intent intent = new Intent(this, Final.class);
            intent.putExtra(EXTRA_NUMBER, i);
            startActivity(intent);
        }
    }
}
