package com.zadania.Zadanie_001;

public class Main {

    public static void main(String[] args) {
        int temp, size;
        int[] numbers = {1, 13, 51322, -513, 0, 53, 100, 555};
        size = numbers.length;
        System.out.println("Tablica ma " + size + " elemntów");


        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] >numbers[j]){
                    temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Największym elementem jest: " + numbers[size-1]);
    }
}
