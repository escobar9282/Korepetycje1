package com.zadania.zadanie3_24;

public class Main {
    public static void main(String[] args) {
        int i = 65;
        int j = 90;
        while (i <= 90) {
            System.out.print((char) i);
            System.out.print(" ");
            i++;
        }

        while (j >= 65) {
            System.out.print((char)j);
            j--;
            System.out.print(" ");
        }
    }
}
