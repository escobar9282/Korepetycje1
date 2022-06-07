package com.zadania.zadanie4_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = sc.nextLine();

        System.out.println("Enter your last name");
        String lastName = sc.nextLine();
        System.out.println("Your first name contains " + firstName.length() + " letters");
        System.out.println("Your last name contains " + lastName.length() + " letters");

    }

}
    /*Napisz program, który umożliwia odczytywanie długości
        łańcucha zapamiętanego w odpowiedniej zmiennej.
        Skorzystaj z metody length() , a wynik wyświetl na
        ekranie monitora.*/
