package com.zadania.zadanie2_5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int valueOfNumber = -5;
        int numberFromUser = 0;
        int numberOfTries = 0;
        while (valueOfNumber != numberFromUser) {
            valueOfNumber = random.nextInt(11) + 5;
            System.out.println("Please, enter a number");
            numberFromUser = sc.nextInt();
            if (valueOfNumber == numberFromUser) {
                System.out.println("You' ve guested a good number !");

            }

        }
    }
}
//    Napisz program, w którym użytkownik zgaduje losową liczbę z przedziału od 0 do 9
//        generowaną przez komputer.
