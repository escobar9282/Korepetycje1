package com.zadania.Zadanie_002;

public class Main {
//Zad.2
//Zaprogramuj algorytm sprawdzający czy dana liczba jest pierwsza?
static void checkPrime(int n){
    int i, m = 0, flag = 0;
    m = n / 2;

    if (n==0 || n==1){
        System.out.println(n + " nie jest liczbą pierwszą");
    }
    else {
        for (i = 2; i <=m; i++) {
            if (n%i == 0){
                System.out.println(n+ " nie jest liczbą pierwszą");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println(n+ " jest liczbą pierwsza");
        }
    }
}
    public static void main(String[] args) {
   checkPrime(3);
   checkPrime(1);
   checkPrime(4);
   checkPrime(17);
    }
}
