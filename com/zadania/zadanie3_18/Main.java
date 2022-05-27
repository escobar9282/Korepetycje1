package com.zadania.zadanie3_18;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int average = 0;
        Random random = new Random();
        i = 5;
        while (j < i) {
            int n = random.nextInt(300) + 1;
            System.out.println(n);
            average = average + n;
            j++;

        }
        average /= i;

        System.out.println("Średnia z liczb to " + average);
    }
}
