package com.example.a2048clone;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import java.util.ArrayList;

//idea for concept, divide board into 4 sub squares (corners) where each corner is mirrored around the origin
//from its original position
//index 1 remains "top right", but is positioned as the top right of the bottom left corner
public class Board  {

    ArrayList<Square> tiles;
    ArrayList<Corner> corners;

    public Board(ArrayList<Square> t, ArrayList<Corner> c){

        this.tiles = t;
        this.corners = c;

    }

    public void chooseD(int d){

        switch (d){
            //left
            case 0:
                slide(3,2,1,0);
                slide(7,6,5,4);
                slide(11,10,9,8);
                slide(15,14,13,12);
                break;

            //right
            case 1:
                slide(0,1,2,3);
                slide(4,5,6,7);
                slide(8,9,10,11);
                slide(12,13,14,15);
                break;

            //down
            case 2:
                slide(12,8,4,0);
                slide(13,9,5,1);
                slide(14,10,6,2);
                slide(15,11,7,3);
                break;

            //up
            case 3:
                slide(0,4,8,12);
                slide(1,5,9,13);
                slide(2,6,10,14);
                slide(3,7,11,15);
                break;
        }

    }

    public void slide( int i1, int i2, int i3, int i4 ){

        if((tiles.get(i1)).getVal() == (tiles.get(i2)).getVal()){
            (tiles.get(i1)).setVal(0);
            (tiles.get(i2)).doubleVal();

        } else if((tiles.get(i2)).getVal() == 0){
            if((tiles.get(i1)).getVal() == (tiles.get(i3)).getVal()){
                (tiles.get(i1)).setVal(0);
                (tiles.get(i3)).doubleVal();

            } else if((tiles.get(i3)).getVal() == 0){
                if((tiles.get(i1)).getVal() == (tiles.get(i4)).getVal()){
                    (tiles.get(i1)).setVal(0);
                    (tiles.get(i4)).doubleVal();

                } else if((tiles.get(i4)).getVal() == 0){
                    (tiles.get(i4)).setVal((tiles.get(i1)).getVal());
                    (tiles.get(i1)).setVal(0);
                }


            }

        }
        if((tiles.get(i2)).getVal() == (tiles.get(i3)).getVal()){
            (tiles.get(i2)).setVal(0);
            (tiles.get(i3)).doubleVal();

        } else if((tiles.get(i3)).getVal() == 0){
            if((tiles.get(i2)).getVal() == (tiles.get(i4)).getVal()){
                (tiles.get(i2)).setVal(0);
                (tiles.get(i4)).doubleVal();

            } else if((tiles.get(i4)).getVal() == 0){
                (tiles.get(i4)).setVal((tiles.get(i2)).getVal());
                (tiles.get(i2)).setVal(0);
            }


        }
        if((tiles.get(i2)).getVal() == (tiles.get(i4)).getVal()){
            (tiles.get(i2)).setVal(0);
            (tiles.get(i4)).doubleVal();

        } else if((tiles.get(i4)).getVal() == 0){
            (tiles.get(i4)).setVal((tiles.get(i2)).getVal());
            (tiles.get(i3)).setVal(0);
        }

    }

}