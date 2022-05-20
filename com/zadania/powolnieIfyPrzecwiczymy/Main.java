package com.zadania.powolnieIfyPrzecwiczymy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usersAge = sc.nextInt();
        if (usersAge > 5) {
            System.out.println("User have more than 5 years");
        }
        else if (usersAge > 2) {
            System.out.println("User have more than 2 years");
        }
        else  {
            System.out.println("User have more than 10 years");
        }
    }
}
//Pytam użytkownika  o jego wiek, jeżeli wiek użytkownika jest mniejszy
//od 18, to napisz, ze użytkownik jest jeszcze dzieckiem. Jeżeli
//Uzytownik ma więcej niż 18 lat i jednocześnie mniej niż 35 lat
//to wyświetl, że użytkownik jest dorosły.W innym wypadku
//wyswietl, że uztkownik może startować na prezydenta.