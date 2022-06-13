package com.zadania.zadanie5_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] board = new int[6];
        int n = 6;
        Sorting sorting = new Sorting();
        sorting.bubbleSorting(board, n);
    }
}
