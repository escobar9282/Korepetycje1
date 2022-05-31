package com.zadania.zadanie4_8;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = new int[10][10];
        int[][] matrix2 = new int[10][10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                matrix1[i][j] = j;
                System.out.print(matrix1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                matrix2[i][j] = matrix1[j][i];
                System.out.print(matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
//    Dane są dwie tablice dwuwymiarowe 10×10
//        o nazwach a i b . Tablica a zawiera
//        elementy przedstawione poniżej.
