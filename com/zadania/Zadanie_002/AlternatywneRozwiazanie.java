package com.zadania.Zadanie_002;

import java.util.Scanner;

public class AlternatywneRozwiazanie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int n = sc.nextInt();
        if (checkIfPrime(n)) {
            System.out.println(n+ " jest liczbą pierwsza");
        } else {
            System.out.println(n+" nie jest liczba pierwszą");
        }

    }

    public static boolean checkIfPrime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
        }
    }
