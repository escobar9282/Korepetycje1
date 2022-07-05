package com.zadania.powtórki;

public class Zadanie3_13 {
    public static void main(String[] args) {
        int sum = 0;
    for (int i = 0; i <= 100; i++){
        if (!(i%2 == 0)) {
            sum += i;

            if (sum%2 == 1) {
                System.out.print(sum + " ");
            }
        }


    }


    }
}
