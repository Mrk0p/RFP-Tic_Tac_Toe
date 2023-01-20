package com.bridgelabz.tic_tac_toe;

import java.util.Scanner;
public class TicTacToe {
    
    // create an array
    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;
    
    // create a method for iteration 
    // for loop goes 1 to 9
         
    private static void createEmptyBoard()
    {
        for(int index=1; index<board.length;index++)
        {
            board[index] = ' ';
        }
    }
    
    // method for choose X or O
    // using ternary operator ? exp1:exp2
    private static void chooseLetter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter :: X or O : ");
        userLetter = scanner.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }
    public static void main(String[] args)
    {
        createEmptyBoard();
        chooseLetter();

    }

}
