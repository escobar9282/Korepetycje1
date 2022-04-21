package com.zadania.Zadanie_010;

public class AlternatywneRozwiazanie {
    public static void main(String[] args) {
    int n = 12;
        System.out.println("Sumą naturalnych liczb " + sumOfNaturalNumbers(n));
    }

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
