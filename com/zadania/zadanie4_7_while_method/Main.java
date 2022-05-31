package com.zadania.zadanie4_7_while_method;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int i = 0;
        int j = 0;
        while (i <= 9) {
            while (j<=9) {
                if (j==0) {
                    matrix[i][j] = i;
                }
                if (j==1) {
                    matrix[i][j] = multiplicationTable1(i);
                }
                System.out.print(matrix[i][j]);
                System.out.print(" ");
                j++;
            }
            j=0;
            i++;
            System.out.println("");
        }
    }
    static int multiplicationTable1(int firstIndex) {
        return (int) Math.pow(firstIndex, 2);
    }
}
//    Napisz program, który w zadeklarowanej tablicy
//        dwuwymiarowej 10×10 umieszcza w pierwszej kolumnie
//        liczby od 0 do 9, w drugiej kwadraty tych liczb, natomiast
//        w pozostałych kolumnach 0 (interpretacja graficzna tablicy poniżej).
//        Dodatkowo program powinien obliczać osobno sumę liczb znajdujących się
//        w pierwszej oraz w drugiej kolumnie.
