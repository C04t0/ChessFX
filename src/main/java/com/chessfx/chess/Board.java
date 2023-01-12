package com.chessfx.chess;

public class Board {
    private int x;
    private int y;
    private static final String EMPTY = "u+25A1";
    private Piece [][] chessboard = new Piece[x][y];

    public void Board(int x, int y) {           // methode bord (toegepast op x en y)
        chessboard = new Piece[x][y];
    }
    public boolean isEmpty(int x, int y) {          //checken of een vak leeg is
        if (chessboard[x][y] == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isValidMove(int x, int y) {              //checks of move binnen veld is
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            return true;
        } else {
            return false;
        }
    }
    public void showBoard() {                       //methode om het bord weer te geven
        for(x = 0; x < getX(); x++) {
            for(y = 0; y < getY(); y++) {

                if (isValidMove(x, y)) {
                    if (isEmpty(x, y)) {
                        System.out.print(Board.EMPTY);
                    } else {
                        if (chessboard[x][y] instanceof Pawn) {
                            System.out.print("P");
                        } else if (chessboard[x][y] instanceof Rook) {
                            System.out.print("R");
                        } else if (chessboard[x][y] instanceof Bishop) {
                            System.out.print("B");
                        } else if (chessboard[x][y] instanceof Knight) {
                            System.out.print("L");
                        } else if (chessboard[x][y] instanceof Queen) {
                            System.out.print("Q");
                        } else if (chessboard[x][y] instanceof King) {
                            System.out.print("K");
                        }
                    }
                } else {
                    System.out.println("Dit vak valt buiten het bord.");
                }
            }
        }
    }
    public int getX () {                     //getter voor x-coordinaat
        return chessboard.length;
    }
    public int getY () {                     //getter voor y-coordinaat
        return chessboard[0].length;
    }
    public Piece[][] getBoard () {            //getter voor het bord
        return chessboard;
    }
    public Piece setPiece (Piece chessPiece,int x, int y){ // setter voor het plaatsen van een stuk
        if (isValidMove(x, y)) {
            return chessboard[x][y] = chessPiece;
        } else {
            System.out.println("This is not a valid move.");
        }
        return chessPiece;
    }
    public void removePiece (Piece chessPiece){             //piece remover
        int oldX = chessPiece.getX();
        int oldY = chessPiece.getY();
        chessboard[oldX][oldY] = null;
    }
}
