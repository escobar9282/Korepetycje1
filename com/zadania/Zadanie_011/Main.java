package com.zadania.Zadanie_011;

public class Main {
    public static void main(String[] args) {
        int number2 = 18;
        System.out.println("Binarnym przelicznikiem liczby " + number2 + " jest = " + convertIntegerToBinary(number2));
    }
    public static String convertIntegerToBinary(int number){
        return Integer.toBinaryString(number);
    }
}
//Zadanie 11.
//        Napisz program który zamieni liczbę z systemu dziesiętnego na binarny np. 18 -> 10010