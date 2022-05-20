package com.zadania.zadanie3_2;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        do {
            int y;
            y = 3 * x;
            System.out.println("Wartosć y "+ y);
            x++;
        }
        while (x <= 10);
    }
}
//Zadanie 3.2.
//        Napisz program, który za pomocą instrukcji do ... while
//        dla danych wartości x zmieniających się od 0 do 10 oblicza
//        wartość funkcji y = 3x .
