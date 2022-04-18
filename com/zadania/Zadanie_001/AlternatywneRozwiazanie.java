package com.zadania.Zadanie_001;

import java.util.Arrays;

public class AlternatywneRozwiazanie {
    //Możesz także posortować elementy danej tablicy za pomocą metody sortowania klasy java.util.Arrays, a następnie wypisz pierwszy element  od końca tablicy
    public static void main(String[] args) {
        int[] numbers = {1,13,513222,-513,0,53,100,555};
        int size = numbers.length;

        Arrays.sort(numbers);
        System.out.println("Sortuje tą tablicę: " + Arrays.toString(numbers));
        int result = numbers[size-1];
        System.out.println("Największym elementem jest " + result);
    }
}
