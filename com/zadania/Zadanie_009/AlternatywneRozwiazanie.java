package com.zadania.Zadanie_009;

public class AlternatywneRozwiazanie {
    public static void main(String[] args) {
    int n = 8;
        System.out.println("W ciagu fibonacciego o indexie " + n + " = " + fibonacci(n) );
    }

    public static int fibonacci(int n) {
        double equation = (1 + Math.sqrt(5)) / 2;
        return (int) ((int) Math.round(Math.pow(equation, n)) / Math.sqrt(5));
    }
}
