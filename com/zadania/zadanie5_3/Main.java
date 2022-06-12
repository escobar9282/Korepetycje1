package com.zadania.zadanie5_3;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
MultidimensionalBoard multidimensionalBoard = new MultidimensionalBoard();
multidimensionalBoard.showEverything(matrix, 10);
    }
}
    /*Napisz zgodnie z zasadami programowania obiektowego
program, który w tablicy 10×10 umieszcza losowo na przekątnej
        liczby od 0 do 9, a poza przekątną zera. Dodatkowo program
        oblicza sumę liczb znajdujących się na przekątnej.
        Klasa powinna zawierać trzy metody z parametrami:
        czytaj_dane(double [][]macierz, int rozmiar) —
        metoda umieszcza dane w tablicy.
        przetwórz_dane(double [][]macierz, int rozmiar) —
        metoda oblicza i wyświetla sumę liczb znajdujących
        się na przekątnej.
        wyświetl_wynik(double [][]macierz, int rozmiar) —
        metoda wyświetla zawartość tablicy na ekranie monitora.*/
