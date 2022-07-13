package com.zadania.zadanie6_1_extra_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class Credentials {

    private String firstName;
    private String lastName;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name Your excellence");
        firstName = sc.nextLine();
        System.out.println("Please enter Your last name Your excellence");
        lastName = sc.nextLine();
    }

    public void saveToFile() {
        try(FileWriter savingFile = new FileWriter("F:\\Dokumenty F\\Nowy folder\\Różne\\data.txt")) {
            savingFile.write(firstName);
            savingFile.write(lastName);
        }
        catch (IOException exception){
            System.out.println("An error occurred");
        }

    }
    public void readDataFromFile() {
        try (FileReader fr = new FileReader("F:\\Dokumenty F\\Nowy folder\\Różne\\data.txt")) {


            while (fr.read() != -1) {
//                System.out.println(scanner.next());
            }
        } catch (IOException exception) {
            System.out.println("sssss");
        }
    }
}
/* Napisz zgodnie z zasadami programowania obiektowego
program, który wczytuje z klawiatury imię i nazwisko,
        zapisuje te dane do pliku tekstowego dane.txt ,
        a następnie odczytuje je z tego pliku i wyświetla
        na ekranie komputera. Klasa powinna zawierać trzy metody:
        czytaj_dane() — metoda wczytuje z klawiatury imię i nazwisko.
        zapisz_dane_do_pliku() — metoda zapisuje imię i nazwisko
        do pliku tekstowego o nazwie dane.txt .
        czytaj_dane_z_pliku() — metoda odczytuje dane
        z pliku dane.txt i wyświetla je na ekranie komputera.
*/