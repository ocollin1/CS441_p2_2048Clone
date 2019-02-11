package com.example.a2048clone;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
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
