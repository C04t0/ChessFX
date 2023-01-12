package com.chessfx.chess;

public abstract class Piece {

    public boolean isValidMove;
    public int startX;
    public int startY;
    public int x;
    public int y;

    abstract void move(int startX, int startY, int x, int y);       //abstracte methode move

    //getter & setter

    public int getX() {
        return x;
    }
    public int getStartX(){
        return startX;
    }
    public int getY() {
        return y;
    }
    public int getStartY() {
        return startY;
    }
}
