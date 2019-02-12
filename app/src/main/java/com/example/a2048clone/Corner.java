package com.example.a2048clone;

//import Square.java;
//Subdivision of board into one of the four corners

//idea for concept, divide board into 4 sub squares (corners) where each corner is mirrored around the origin
//from its original position
//index 1 remains "top right", but is positioned as the top right of the bottom left corner
public class Corner {

    int i;
    Square tl,tr,bl,br;

    public Corner(){}

    public Corner(int index, Square topleft, Square topright, Square bottomleft, Square bottomright){
        i = index;
        tl = topleft;
        tr = topright;
        bl = bottomleft;
        br = bottomright;

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Square getTl() {
        return tl;
    }

    public void setTl(Square tl) {
        this.tl = tl;
    }

    public Square getTr() {
        return tr;
    }

    public void setTr(Square tr) {
        this.tr = tr;
    }

    public Square getBl() {
        return bl;
    }

    public void setBl(Square bl) {
        this.bl = bl;
    }

    public Square getBr() {
        return br;
    }

    public void setBr(Square br) {
        this.br = br;
    }
}
