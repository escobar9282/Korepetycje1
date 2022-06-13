package com.zadania.zadanie5_4;

import java.util.Scanner;

public class Sorting {
    private void loadData(int[] board2, int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; size > i; i++) {
            System.out.println("Enter index " + i);
            board2[i] = sc.nextInt();
        }
    }

    private void processData(int[] board3, int size) {
        do {
            for (int i = 0; size - 1 > i; i++) {
                if (board3[i] > board3[i + 1]) {
                    int temporaryValue = board3[i];
                    board3[i] = board3[i + 1];
                    board3[i + 1] = temporaryValue;
                }
            }
            size -= 1;

        }
        while (size > 1);
    }
    private void showScore(int[] board4) {
        for (int crossOverTheBoard : board4) {
            System.out.println(crossOverTheBoard);
        }
    }
    public void bubbleSorting(int[] board, int number) {
        loadData(board, number);
        processData(board, number);
        showScore(board);
    }
}
   /* Napisz zgodnie z zasadami programowania obiektowego
program, który sortuje n liczb (w programie jest ich sześć).
        Klasa powinna zawierać trzy metody z parametrami:
        czytaj_dane(int [] liczby, int n) — metoda czyta dane
        i umieszcza je w tablicy o nazwie liczby .
        przetwórz_dane(int [] liczby, int n) — metoda sortuje
        dane według wybranego algorytmu sortowania (w programie
        wykorzystano algorytm sortowania bąbelkowego).
        wyświetl_wynik(int [] liczby, int n) — metoda wyświetla
        zawartość posortowanej tablicy liczby na ekranie monitora.*/
