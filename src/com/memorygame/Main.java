package com.memorygame;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GameBoard gameBoard = new GameBoard();
                gameBoard.setVisible(true);
            }
        });
    }
}
