package com.zadania.powtórka_zadanie2_5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double drawNumber, guessNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 9");

        Random r = new Random();
        drawNumber = Math.round(10 * (r.nextDouble()));
        guessNumber = Double.parseDouble(sc.nextLine());
        if (guessNumber == drawNumber){
            System.out.println("Congrats!!!You.ve guessed the number");
        }
        else{
            System.out.println("I'm very sorry, you haven't guessed the number");
        }
    }
}
