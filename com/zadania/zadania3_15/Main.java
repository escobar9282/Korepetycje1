package com.zadania.zadania3_15;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        int i = 0;
        while (!(i == 101)) {
            if (i % 2 == 1) {
                score += i;
            }
            i++;
        }
        System.out.println("Wynik to " + score);
    }
}
