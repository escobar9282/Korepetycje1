package com.zadania.zadanie3_21;

public class Main {
    public static void main(String[] args) {
        int firstMultiplicationTable = 0;
        int secondaryMultiplicationTable = 0;
        while (firstMultiplicationTable <= 10) {
            while (secondaryMultiplicationTable <= 10) {
                System.out.print(firstMultiplicationTable * secondaryMultiplicationTable);
                System.out.print(" ");
                secondaryMultiplicationTable++;
            }
            firstMultiplicationTable++;
            secondaryMultiplicationTable = 0;
        }
    }
}
