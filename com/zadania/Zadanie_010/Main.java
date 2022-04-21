package com.zadania.Zadanie_010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int number, i, sum = 0;
        Scanner o = new Scanner(System.in);
        System.out.println("Suma od");
        i = o.nextInt();
        System.out.println("Suma do");
        number = o.nextInt();
        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sumą naturalnych liccb " + sum);
    }
}
//    Napisz program który zlicza wszystkie liczby od 0 do N