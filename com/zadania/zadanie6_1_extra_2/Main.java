package com.zadania.zadanie6_1_extra_2;

import com.zadania.zadanie6_1_extra_2.Credentials;

public class Main {
    public static void main(String[] args) {
        Credentials credentials = new Credentials();
        credentials.readData();
        credentials.saveDataToFile();
        credentials.readDataFromFile();
    }
}
