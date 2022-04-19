package com.zadania.Zadanie_005;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            i++;
            if (i % 15 == 0) {
                System.out.println("fizz buzz");

            } else if (i % 3 == 0) {
                System.out.println("fizz");

            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
//    wypisz liczby od 1 do 100 następnie dla liczb podzielnych przez 3 wypisz Fizz dla liczb podzielnych
//        przez 5 wypisz Buzz dla liczb podzielnych przez 3 i przez 5 wypisz FizzBuzz,
//        w przeciwynym razie wypisz wartość liczby
//
//        1
//        2
//        Fizz
//        4
//        Buzz
//        ...
//        13
//        14
//        FizzBuzz
//        16