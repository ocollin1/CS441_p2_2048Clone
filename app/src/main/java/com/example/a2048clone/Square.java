package com.example.a2048clone;

import android.support.annotation.VisibleForTesting;

public class Square {

    int ind, val;
    Square up, down, left, right, nullSquare;


    public Square(){}

    //allow for one square with index -1 to act as sides of side tiles
    public Square(int index, Square nullSq){
        val=0;
        ind = index;
        nullSquare = nullSq;
    }


    int getInd(){
        return ind;
    }
    int getVal(){
        return val;
    }

    public Square getnSq(){
        return nullSquare;
    }

    void addVal(int a){
        val += a;
    }



    void setDirections(Square newUp, Square newDown, Square newLeft, Square newRight){
        if(newUp.getInd() == ind){
            up = nullSquare;
        } else {
            up = newUp;
        }
        if(newDown.getInd() == ind){
            down = nullSquare;
        } else {
            down = newDown;
        }
        if(newLeft.getInd() == ind){
            left = nullSquare;
        } else {
            left = newLeft;
        }
        if(newRight.getInd() == ind){
            right = nullSquare;
        } else {
            right = newDown;
        }

    }

    // d for direction. 1 = up, 2 = down, 3 = left, 4 = right
    void slide(int d){

        switch (d){
            case 1:
                up.addVal(val);
                break;
            case 2:
                down.addVal(val);
                break;
            case 3:
                left.addVal(val);
                break;
            case 4:
                right.addVal(val);
                break;
        }
        val = 0;

    }

    void reset(){
        val = 2;
    }

}
