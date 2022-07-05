package com.zadania.powtórki;

public class Zadanie3_14 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do {
            if (!(i % 2 == 0)) {
                sum += i;
                System.out.print(sum + " ");
            }
            i++;

        }

        while (i <= 100);


    }
}
