package com.example.a2048clone;

//import Square.java;
//Subdivision of board into one of the four corners

//idea for concept, divide board into 4 sub squares (corners) where each corner is mirrored around the origin
//from its original position
//index 1 remains "top right", but is positioned as the top right of the bottom left corner
public class Corner {

    int i;
    Square t,b,l,r;

    public Corner(){}

    public Corner(int index, Square top, Square bottom, Square left, Square right){
        i = index;
        t = top;
        b = bottom;
        l = left;
        r = right;

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Square getT() {
        return t;
    }

    public void setT(Square t) {
        this.t = t;
    }

    public Square getB() {
        return b;
    }

    public void setB(Square b) {
        this.b = b;
    }

    public Square getL() {
        return l;
    }

    public void setL(Square l) {
        this.l = l;
    }

    public Square getR() {
        return r;
    }

    public void setR(Square r) {
        this.r = r;
    }
}
