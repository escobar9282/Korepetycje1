package com.zadania.zadanie4_2;

public class Main {
    public static void main(String[] args) {
        int[][] multidimensionalTab = new int[10][10];
        int i = 0;
        int j = 0;
        int evaluation = 0;
        do {
            do {
                if (i == j) {
                    multidimensionalTab[i][j] = 1;
                    evaluation++;
                }
                System.out.print(multidimensionalTab[i][j]);
                System.out.print(" ");
                j++;
            }
            while (j <= 9);
            System.out.println("");
            i++;
            j = 0;
        }
        while (i <= 9);

    }
}
//Zadanie 4.3.
//        Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
//        o nazwie macierz umieszcza na przekątnej liczbę 1, a poza przekątną 0.
//        Dodatkowo program powinien obliczać sumę elementów wyróżnionych w tablicy,
//        tj. tych znajdujących się na jej przekątnej.
