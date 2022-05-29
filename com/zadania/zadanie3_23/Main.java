package com.zadania.zadanie3_23;

public class Main {
    public static void main(String[] args) {
        int i = 65;
        int j = 89;

        do {
            System.out.print((char) i);
            i++;
            System.out.print(" ");
        }
        while (i <= 90);
        do {

            System.out.print((char) j);
            System.out.print(" ");
            j--;
        }
        while (j >= 65);


    }
}
