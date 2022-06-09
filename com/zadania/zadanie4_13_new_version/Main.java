package com.zadania.zadanie4_13_new_version;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your name ");
        String firstName = sc.nextLine();
            firstName = numberExceptionTheBeginning(firstName,sc);
        System.out.println("Give me your last name ");
        String lastName = sc.nextLine();
        lastName = numberExceptionTheBeginning(lastName, sc);
        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();
        System.out.println(firstNameLength);
        System.out.println(lastNameLength);
    }
    public static String numberExceptionTheBeginning(String firstName, Scanner scanner){
        int i = 0;
        do {
            if (firstName.charAt(i) >= 65 && 90 >= firstName.charAt(i)){
                i++;
            }
            else if (firstName.charAt(i) >= 96 && 122 >= firstName.charAt(i)){
                i++;
            }
            else {
                i = 0;
                System.out.println("Enter your firstName ");
                firstName = scanner.nextLine();
            }
        } while (firstName.length() != i);
        return firstName;
    }
}
