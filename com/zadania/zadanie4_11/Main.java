package com.zadania.zadanie4_11;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = new int[10][10];
        int[][] matrix2 = new int[10][10];
        int[][] matrix3 = new int[10][10];
        score1(matrix1, 6);
        score1(matrix2, 8);
        score1(matrix3, matrix1[5][9] * matrix2[9][9]);

    }
    public static void score1(int[][] multiplicationTable, int number) {
        for (int i = 0; i <=9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[i][j] = number;
                System.out.print(multiplicationTable[i][j] + " ");

            }
            System.out.println("");

        }
        System.out.println("");
    }
}
