package com.zadania.zadanie4_10_method;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = new int[10][10];
        int[][] matrix2 = new int[10][10];
        int[][] matrix3 = new int[10][10];
        score1(matrix1, 4);
        score1(matrix2, 2);
        score1(matrix3, matrix1[4][5]-matrix2[3][8]);

    }
    public static void score1(int[][] multiplicationTable, int number){
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <=9; j++) {
                multiplicationTable[i][j] = number;
                System.out.print(multiplicationTable[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println();
    }

}
