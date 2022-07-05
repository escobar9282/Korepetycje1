package com.zadania.powtórki;

public class Zadanie3_11 {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        do {
            if (i%2 == 1){
                sum += i;
                System.out.print(sum + " ");
            }
            i++;


        }
        while (i <= 100);
    }
}
