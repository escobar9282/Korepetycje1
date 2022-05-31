package com.zadania.zadanie_michal_007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicationTable = sc.nextInt();
        System.out.println(Math.pow(multiplicationTable, 2));
    }
}
//    Write a program that prompts the user to input a positive integer.
//        It should then print the multiplication table of that number.