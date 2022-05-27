package com.zadania.zadanie3_3;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;
        int y = 0;
        while (x <= 10) {
            sum += 3*x;
            x++;
        }

        System.out.println("Wynik to " + sum);
    }
}
//Zadanie 3.3.
//        Napisz program, który za pomocą instrukcji while
//        dla danych wartości x zmieniających się od 0 do 10
//        oblicza wartość funkcji y = 3x .
