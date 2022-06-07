package com.zadania.zadanie4_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First letter string is ");
        String firstString = sc.nextLine();
        System.out.println("Second letter string is");
        String secondString = sc.nextLine();
        System.out.println("The whole string is " + firstString + secondString);
        System.out.println("The whole string is " + secondString + firstString);
    }
}
