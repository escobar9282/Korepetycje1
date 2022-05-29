package com.zadania.zadanie_Michal_004;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomizedNumber = new Random(200);
        for (int i = 0; i < 100; i++) {
            System.out.println(randomizedNumber.nextDouble());

        }
    }
}
// żeby było śmiesznie wybrałem next double xD