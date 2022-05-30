package com.zadania.zadanie4_1_new_version;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i <= 9; i++) {
            tab[i] = 10 - 1 -i;
            System.out.print(tab[i]);
            System.out.print(" ");
        }
    }
}
