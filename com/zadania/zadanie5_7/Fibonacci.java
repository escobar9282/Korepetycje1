package com.zadania.zadanie5_7;

public class Fibonacci {
    private static final int FIBONACCI_STRING_ONE = 0;
    private static final int FIBONACCI_STRING_TWO = 1;

    public static void theNumberResponsibleForFibonacciNumbers(int howManyFibonacciNumbers) {
        int n = FIBONACCI_STRING_ONE;
        int m = FIBONACCI_STRING_TWO;
        for (int i = 0; i < howManyFibonacciNumbers; i++) {
            System.out.println(n + m);
            if (i % 2 == 0) {
                n = n + m;
            }
            if (i % 2 == 1) {
                m = n + m;
            }
        }
    }
}
//    Napisz program, który znajduje 10 pierwszych
//        liczb Fibonacciego i wyświetla je na ekranie
//        komputera.
//        image (Obraz3582.PNG) W matematyce ciąg
//        Fibonacciego to ciąg liczb naturalnych określony
//        rekurencyjnie w następujący sposób: pierwszy wyraz jest równy F 0 = 0,
//        drugi jest równy F 1 = 1, każdy następny jest sumą dwóch poprzednich, tzn.
//        F n -1 + F n -2 dla n > 1. Wyrazy ciągu Fibonacciego to:
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...