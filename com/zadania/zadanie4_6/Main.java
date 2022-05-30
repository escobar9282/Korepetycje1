package com.zadania.zadanie4_6;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int multiplicationIntegers = 0;
        int i = 0;
        int j = 0;
        do {
            do {
                if (i + j + 1 == 10) {
                    matrix[i][j] = i;
                    multiplicationIntegers = multiplicationIntegers + i;
                }
                System.out.print(matrix[i][j]);
                System.out.print(" ");
                j++;
            }
            while (j <= 9);
            System.out.println("");
            i++;
            j = 0;
        }
        while (i <= 9);
        System.out.print(multiplicationIntegers);

    }
}
//Zadanie 4.6.
//        Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
//        o nazwie macierz umieszcza liczby od 0 do 9 zgodnie z załączoną
//        poniżej interpretacją graficzną. Program dodatkowo powinien obliczać
//        sumę wyróżnionych elementów.
