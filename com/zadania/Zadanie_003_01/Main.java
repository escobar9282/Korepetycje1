package com.zadania.Zadanie_003_01;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 4, 6, 6, 90, 151, -6};
        int temporary, size;
        size = numbers.length;
        System.out.println("tablica ma " + size + " elementów");

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] > numbers[j]) {
                    temporary = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temporary;
                }
            }
        }
        System.out.println("Największym elementem jest " + numbers[size-1]);
        System.out.println("Najmniejszym elementem tablicy jest" + numbers[0]);
    }
}
//Zadanie 3.
//        Napisz program który pobiera N liczb całkowitych i wyświetla największą i najmniejszą z nich
//
//        int[] numbers = {1, 1, 4, ,6 ,6 ,90, 151, -6}
//        Najmniejsza podana liczba to -6, a największa to 151
