package com.zadania.zadanie3_13;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        for (int i = 1; 101 > i; i++) {
            if (i % 2 == 1) {
                score = score + i;
                System.out.println("Wyświetlam liczby" + i);
            }


        }

        System.out.println("Suma liczb nieprzystych od 1 do 100 to" + score);
    }
}
