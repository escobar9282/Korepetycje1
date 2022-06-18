package com.zadania.powtórka_zadanie3_2;

public class Main {
    public static void main(String[] args) {
        int x = 0, y = 0;
        do {
            y = 3 * x;
            System.out.print("Result is " + y);
            System.out.print(" ");
            x++;
        }
        while (x<=10);
    }
}
