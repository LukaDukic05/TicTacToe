package org.example;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentplayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentplayer = player1;
        board = new Board();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            board.print();
            System.out.println("Current Player: " +currentplayer.getMarker());

            int x, y;
            do {
                System.out.print("row (0-2): ");
                x = scanner.nextInt();
                System.out.print("column (0-2): ");
                y = scanner.nextInt();
            }while (!board.isCellEmpty(x,y));

            board.place(x, y, currentplayer.getMarker());

            if(hasWinner()) {
                board.print();
                System.out.println("Player " + currentplayer.getMarker() + " wins!");
                break;
            }

            if (board.isFull()) {
                board.print();
                System.out.println("It's a draw!");
                break;
            }

            switchCurrentPlayer();
        }
    }
    public void switchCurrentPlayer() {
        currentplayer = (currentplayer == player1) ? player2 : player1;
    }

    public boolean hasWinner() {
        char[][] c = board.getCells();

        for (int i = 0; i < 3; i++) {
            if (c[i][0] != '\u0000' && c[i][0] == c[i][1] && c[i][1] == c[i][2]) return true;
            if (c[0][i] != '\u0000' && c[0][i] == c[1][i] && c[1][i] == c[2][i]) return true;
        }

        if (c[0][0] != '\u0000' && c[0][0] == c[1][1] && c[1][1] == c[2][2]) return true;
        if (c[0][2] != '\u0000' && c[0][2] == c[1][1] && c[1][1] == c[2][0]) return true;

        return false;
    }
}
