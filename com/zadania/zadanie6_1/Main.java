package com.zadania.zadanie6_1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        Credentials credentials = readUserData();
        saveUserCredentials(credentials);
        System.out.println(Credentials.mapCredentialsFromFile("H:\\Dokumenty F\\data.txt"));
    }

    private static Credentials readUserData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String firstName = sc.nextLine();

        System.out.println("Enter lastName");
        String lastName = sc.nextLine();


        return new Credentials(firstName, lastName);
    }

    private static void saveUserCredentials(Credentials credentials) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("H:\\Dokumenty F\\data.txt"));
            bufferedWriter.write(String.format("firstName %s \n", credentials.getName()));
            bufferedWriter.write(String.format("lastName %s \n", credentials.getLastName()));
            bufferedWriter.close();
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }

}
