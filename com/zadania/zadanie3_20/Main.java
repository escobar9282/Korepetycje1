package com.zadania.zadanie3_20;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        do {
            do {
                System.out.print(" " + i * j);
                j++;
            }
            while (10 >= j);
            i++;
            j = 0;
            System.out.println();
        }
        while (10 >= i);
    }
}
