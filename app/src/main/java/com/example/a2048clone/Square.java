package com.example.a2048clone;

import android.support.annotation.VisibleForTesting;
import android.widget.Button;

public class Square {

    int ind, val;
    Button button;


    public Square(){}

    //allow for one square with index -1 to act as sides of side tiles
    public Square(int index, Button b){
        val=0;
        ind = index;
        button = b;
        //b.
        //nullSquare = nullSq;
    }


    int getInd(){
        return this.ind;
    }
    int getVal(){
        return this.val;
    }
    Button getButton(){ return this.button; }


    void doubleVal(){
        val *= 2;
    }


    /*
    void setDirections(Square dU, Square dD,Square dL,Square dR){

        if(dU.getInd() == ind){
            dUp = nullSquare;
        } else {
            dUp = dU;
        }
        if( dDown.getInd() == ind){
            dDown = nullSquare;
        } else {
            dDown = dD;
        }
        if( dL.getInd() == ind){
            dLeft = nullSquare;
        } else {
            dLeft = dL;
        }
        if( dR.getInd() == ind){
            dRight= nullSquare;
        } else {
            dRight = dR;
        }

    }
    */
    // d for direction. 1 = up, 2 = down, 3 = left, 4 = right
    /*
    void chooseDirection(int d){

        switch (d){
            case 1:
                dUp.addVal(val);
                break;
            case 2:
                dDown.addVal(val);
                break;
            case 3:
                dLeft.addVal(val);
                break;
            case 4:
                dRight.addVal(val);
                break;
        }
        val = 0;

    }
    */

    //handle in board

    void setVal(int v){
        this.val = v;
    }

}
