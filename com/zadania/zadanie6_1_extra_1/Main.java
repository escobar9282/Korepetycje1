package com.zadania.zadanie6_1_extra_1;

public class Main {
    public static void main(String[] args) {
    Credentials credentials = new Credentials();
    credentials.readData();
    credentials.saveToFile();
    credentials.readDataFromFile();
    }
}
