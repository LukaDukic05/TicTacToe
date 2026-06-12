package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            boolean playAgain;

            do {
                playAgain = false;

                try {
                    TicTacToe game = new TicTacToe();

                    game.start();

                    System.out.println();
                    System.out.print("Do you want to play again? (y/n): ");
                    String response = scanner.next().trim().toLowerCase();
                    playAgain = response.equals("y") || response.equals("yes");

                } catch (InputMismatchException e) {
                    System.out.println("\n[Error] Invalid Input! Only Numbers between 0 and 2 are allowed.");
                    System.out.println("The current Game was canceled. A new Game starts now...\n");
                    scanner.nextLine();

                    playAgain = true;

                } catch (Exception e) {
                    System.out.println("\n[Error] Something went wrong: " + e.getMessage());
                    System.out.println("Restarting...\n");

                    scanner.nextLine();
                    playAgain = true;
                }

                if (playAgain) {
                    System.out.println("=======================================");
                    System.out.println("--- New Game starts now! ---");
                    System.out.println("=======================================\n");
                }

            } while (playAgain);

            System.out.println("Thank you for playing!");
            scanner.close();




















        }
    }
