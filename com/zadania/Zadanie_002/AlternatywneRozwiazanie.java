package com.zadania.Zadanie_002;

public class AlternatywneRozwiazanie {
    public static void main(String[] args) {

    }

    public static boolean checkIfPrime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%1==0){
                return false;
            }
        }
        return true;
        }
    }
