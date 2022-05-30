package com.zadania.zadanie4_5;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int multiplicationIntegers = 0;
        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j <= 9; j++) {
                if (j + i + 1 == 10){
                    matrix[i][j] = 1;
                    multiplicationIntegers++;
                }
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println(multiplicationIntegers);
    }
}
//Zadanie 4.5.
//        Napisz program, który w zadeklarowanej tablicy dwuwymiarowej
//        10×10 o nazwie macierz umieszcza liczby 1 i 0 zgodnie z
//        zamieszczoną poniżej interpretacją graficzną. Program dodatkowo
//        powinien obliczać sumę wyróżnionych elementów.
