package com.zadania.zadanie5_3;

public class MultidimensionalBoard {
    private int score = 0;

    private void  loadData(int[][] board, int whatever) {
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j<= 9; j++) {
                if (j == i) {
                    board[i][j] = i;
                }
                else {
                    board[i][j]= 0;
                }

            }
        }
    }
    private void processData(int[][] board, int whatever) {
        for (int i= 0; i<=9; i++){
            for (int j = 0; j<=9; j++){
                score+=board[i][j];
            }
        }
    }

 private void showScore() {
     System.out.println(score);
 }

 public void showEverything(int[][] board , int whatever) {
        loadData(board, whatever);
        processData(board, whatever);
        showScore();
 }
}
