
package org.example;

public class Board {
    private char [][] cells;

    public Board(){
        cells=new char[3][3];
    }

    public char[][] getCells() {
        return cells;
    }

    public boolean isCellEmpty(int row, int col) {
        return cells[row][col] == '\u0000';
    }

    public void place(int row, int col, char marker) {
        cells[row][col] = marker;
    }
}