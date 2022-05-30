package com.zadania.zadanie4_1_do_while;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[10];
        int i = 0;
        do {
            tab[i] = i;
            System.out.print(tab[i]);
            System.out.print(" ");
            i++;

        }
        while (i<=9);
    }
}
