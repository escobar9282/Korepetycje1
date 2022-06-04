package com.zadania.zadanie4_10;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = new int[10][10];
        int[][] matrix2 = new int[10][10];
        int[][] matrixSubtract = new int[10][10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                matrix1[i][j] = 1;
                matrix2[i][j] = 2;
                matrixSubtract[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(matrixSubtract[i][j] + " ");
            }
            System.out.println("");
        }
    }
}