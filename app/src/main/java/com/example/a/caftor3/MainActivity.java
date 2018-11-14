package com.example.a.caftor3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    int x = 0;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
    }

    public void cat(View view) {
        x++;

        btn.setText("this is click number" + x);
        if (x == 6) {
            btn.setText("Enough to click. go to new start!");
            x = 0;
        }

    }
}