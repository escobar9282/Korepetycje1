package com.zadania.zadanie4_13_with_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "";
        while (true) {
            System.out.println("Putt first name");
            firstName = sc.nextLine();
            try {
                char[] checkList = firstName.toCharArray();

                for (char letter : checkList) {
                    int number = letter;
                    if (!(number >= 65 && number <= 122)) {
                        throw new Exception();
                    }
                }
            } catch (Exception ex) {
                System.out.println("Wrong input data. Please entered only letters");
                continue;
            }
            break;
        }
    }
}
