package com.bridgelabz.tic_tac_toe;

public class TicTacToe {
    static char[] board = new char[10];

    private static void createEmptyBoard()
    {
        for(int index=1; index<board.length;index++)
        {
            board[index] = ' ';
        }
    }

    public static void main(String[] args)
    {
        createEmptyBoard();

    }

}
