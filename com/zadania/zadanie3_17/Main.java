package com.zadania.zadanie3_17;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int average = 0;
        Random random = new Random();
        int i = 5;
        int j = 0;
        do {
            int n = random.nextInt(100) + 1;
            j++;
            average += n;
            System.out.println(n);
        }
        while (j < i);
        average = average / i;
        System.out.println("Średnia tych liczb to  " + average);
    }
}
