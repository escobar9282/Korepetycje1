package com.zadania.zadanie4_12;

public class Main {
    public static void main(String[] args) {
        int[] bubbleSorting = {574, 303, 34, 125, 8, 23};
        int n = bubbleSorting.length;
        do {
            for (int i = 0; n - 1 > i; i++) {
                if (bubbleSorting[i] > bubbleSorting[i + 1]) {
                    int value = bubbleSorting[i];
                    bubbleSorting[i] = bubbleSorting[i + 1];
                    bubbleSorting[i + 1] = value;
                }
            }
            n--;
        }
        while (n > 1);
        for (int singleValue: bubbleSorting)
        {
            System.out.print(singleValue+ " ");
        }
    }
}
   /* Posortuj rosnąco następujące 6 liczb:
        574, 303, 34, 125, 8 oraz 23,
        stosując algorytm sortowania bąbelkowego.*/
