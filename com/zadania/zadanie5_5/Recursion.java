package com.zadania.zadanie5_5;

public class Recursion {
    public static int factorial(int n) {
        int factorialScore = 1;
        if (n >= 2) {
            return n*factorial(n-1);
        }
        else {
            return 1;
        }
    }
}
    /*Napisz program, który rekurencyjnie oblicza kolejne
        wartości n! dla n = 10 i wynik wyświetla na ekranie
        komputera.*/
