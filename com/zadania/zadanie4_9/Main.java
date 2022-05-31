package com.zadania.zadanie4_9;

public class Main {
    public static void main(String[] args) {
        int [][] a = new int[10][10];
        int [][] b = new int[10][10];
        int [][] sum = new int[10][10];
        for (int i = 0; 10 > i; i++) {
            for (int j = 0; 10 > j; j++) {
                a[i][j] = 1;
                b[i][j] = 2;
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
//    Dane są dwie macierze 10×10 o nazwach a i b .
//        Macierz a zawiera elementy przedstawione
//        poniżej.
