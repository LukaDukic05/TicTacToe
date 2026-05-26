
package org.example;
public class Board{
    private char [][] cells;

    public Board(){
        cells=new char[3][3];
    }
    public char[][] getCells(){
        return cells;
    }
}