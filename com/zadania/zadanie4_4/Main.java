package com.zadania.zadanie4_4;

public class Main {
    public static void main(String[] args) {
        int[][] multidimensionalTab = new int[10][10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == j) {
                    multidimensionalTab[i][j]= j;
                }
                System.out.print(multidimensionalTab[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
//Zadanie 4.4.
//        Napisz program, który w zadeklarowanej tablicy
//        dwuwymiarowej 10×10 o nazwie macierz umieszcza
//        na przekątnej liczby od 0 do 9, a poza przekątną
//        liczbę 0. Dodatkowo program powinien obliczać sumę
//        elementów wyróżnionych w tablicy (znajdujących się na przekątnej).
