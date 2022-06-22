package com.bridgelab;

public class TicTocMain {
    public static void main(String[] args) {
        System.out.println("welcome to tic tac toe game");
        TicTacToe game = new TicTacToe();
        game.Board();
        game.selectOption();
        game.showBoard();
    }
}
