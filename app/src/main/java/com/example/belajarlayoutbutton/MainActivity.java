package com.example.belajarlayoutbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnKlikSaya;
    private Button btnCoba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hubungkan button yang disini dengan yang di layout
        this.btnKlikSaya = this.findViewById(R.id.btnKlikSaya);
        this.btnCoba = this.findViewById(R.id.btnCoba);

        // Memberi action pada button
        this.btnKlikSaya.setOnClickListener(this);
        this.btnCoba.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == this.btnKlikSaya)
            this.btnKlikSaya.setBackgroundColor(Color.RED);
        else
            this.btnKlikSaya.setBackgroundColor(Color.BLACK);
    }
}