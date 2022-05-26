package com.zadania.zadanie3_16;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random number = new Random();
        int n = 5;
        double sscore = 0;
        int randomizedNumber;
        int minimumNumber = 100;
        int maximumNumber = -1;
        for (int i = 0; i < n; i++) {
            randomizedNumber = number.nextInt(100);
            if (minimumNumber > randomizedNumber) {
                minimumNumber = randomizedNumber;
            } else if (randomizedNumber > maximumNumber) {
                maximumNumber = randomizedNumber;

            }
            System.out.println(randomizedNumber);
            sscore += randomizedNumber;


        }

        System.out.println(sscore/n);
    }
}
