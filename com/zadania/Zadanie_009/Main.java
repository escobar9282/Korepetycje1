package com.zadania.Zadanie_009;

public class Main {
    public static void main(String[] args) {
    int n = 8;
        System.out.println("Sumą dwóch liczzb ciągu fibonacciego o indeksie " + n + " = " + fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n - 2);

    }
}
//    Wypisz na ekran N wyrazów ciągu fibonacciego
//        0,1,1,2,3,5,8,13,21,34... każdy kolejny wyraz otrzymujemy po przez sumę dwóch poprzednich to jest
//        1 = 0 + 1
//        2 = 1 + 1
//        3 = 2 + 1
//        5 = 3 + 2
//        itd...