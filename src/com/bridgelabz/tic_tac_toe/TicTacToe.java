package com.bridgelabz.tic_tac_toe;

import java.util.Scanner;
public class TicTacToe {

    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;

    private static void createEmptyBoard()
    {
        for(int index=1; index<board.length;index++)
        {
            board[index] = ' ';
        }
    }
    private static void chooseLetter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter :: X or O : ");
        userLetter = scanner.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }
    
    // display the tic tac toe board by using println
    private static void showBoard()
    {
        System.out.println( board[1] + " | " + board[2] + " | " + board[3] );
        System.out.println("----------");
        System.out.println( board[4] + " | " + board[5] + " | " + board[6] );
        System.out.println("----------");
        System.out.println( board[7] + " | " + board[8] + " | " + board[9] );
    }
    public static void main(String[] args)
    {
        createEmptyBoard();
        chooseLetter();
        showBoard();

    }

}
