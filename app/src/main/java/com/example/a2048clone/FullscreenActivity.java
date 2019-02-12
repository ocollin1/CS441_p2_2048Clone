package com.example.a2048clone;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    ArrayList<Corner> corners = new ArrayList<Corner>();
    ArrayList<Square> tiles = new ArrayList<Square>();
    Button up,down,left,right;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        //create board of 4 corners
        final Button b0 = findViewById(R.id.TL0);
        final Button b1 = findViewById(R.id.TL1);
        final Button b2 = findViewById(R.id.TL2);
        final Button b3 = findViewById(R.id.TL3);
        Square s0 = new Square(0,b0);
        Square s1 = new Square(1,b1);
        Square s2 = new Square(2,b2);
        Square s3 = new Square(3,b3);
        Corner c3 = new Corner(3, s0, s1, s2, s3);

        final Button b4 = findViewById(R.id.TR0);
        final Button b5 = findViewById(R.id.TR1);
        final Button b6 = findViewById(R.id.TR2);
        final Button b7 = findViewById(R.id.TR3);
        Square s4 = new Square(4,b4);
        Square s5 = new Square(5,b5);
        Square s6 = new Square(6,b6);
        Square s7 = new Square(7,b7);
        Corner c2 = new Corner(2, s4, s5, s6, s7);

        final Button b8 = findViewById(R.id.BL0);
        final Button b9 = findViewById(R.id.BL1);
        final Button b10 = findViewById(R.id.BL2);
        final Button b11 = findViewById(R.id.BL3);
        Square s8 = new Square(8,b8);
        Square s9 = new Square(9,b9);
        Square s10 = new Square(10,b10);
        Square s11 = new Square(11,b11);
        Corner c1 = new Corner(1, s8, s9, s10, s11);

        final Button b12 = findViewById(R.id.BR0);
        final Button b13 = findViewById(R.id.BR1);
        final Button b14 = findViewById(R.id.BR2);
        final Button b15 = findViewById(R.id.BR3);
        Square s12 = new Square(12,b12);
        Square s13 = new Square(13,b13);
        Square s14 = new Square(14,b14);
        Square s15 = new Square(15,b15);
        Corner c0 = new Corner(0, s12, s13, s14, s15);

        up =(Button)findViewById(R.id.up);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FullscreenActivity.this,"YOUR MESSAGE",Toast.LENGTH_LONG).show();
            }
        });
        down =(Button)findViewById(R.id.down);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FullscreenActivity.this,"YOUR MESSAGE",Toast.LENGTH_LONG).show();
            }
        });
        left =(Button)findViewById(R.id.left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FullscreenActivity.this,"YOUR MESSAGE",Toast.LENGTH_LONG).show();
            }
        });
        right =(Button)findViewById(R.id.right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FullscreenActivity.this,"YOUR MESSAGE",Toast.LENGTH_LONG).show();
            }
        });

    }
}
