package com.zadania.zadanie6_1_extra_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Credentials {
    public String firstName;
    public String lastName;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name Your excellence");
        firstName = sc.nextLine();
        System.out.println("Please enter your last name Your excellence");
        lastName = sc.nextLine();
    }

    public void saveDataToFile() {
        try {
            FileWriter fileWriter = new FileWriter("F:\\Dokumenty F\\Nowy folder\\Różne\\data.txt");
            fileWriter.write(firstName + "\n");
            fileWriter.write(lastName);
            fileWriter.close();
        }catch (IOException exception) {
            System.err.print("an error occurred");
        }
    }

    public void readDataFromFile() {
        try {
            FileReader fileReader = new FileReader("F:\\Dokumenty F\\Nowy folder\\Różne\\data.txt");
            Scanner scanner = new Scanner(fileReader);
            String inputData;
            while((inputData = scanner.nextLine())!=null){
                System.out.println(inputData);
            }
            fileReader.close();
        }catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }catch (IOException exception) {
            System.err.print("an error occurred");
        }catch (NoSuchElementException noSuchElementException){
            System.out.println("All data is read");
        }
    }
}
   /* Napisz zgodnie z zasadami programowania obiektowego
program, który wczytuje z klawiatury imię i nazwisko,
        zapisuje te dane do pliku tekstowego dane.txt ,
        a następnie odczytuje je z tego pliku i wyświetla
        na ekranie komputera. Klasa powinna zawierać trzy metody:
        czytaj_dane() — metoda wczytuje z klawiatury imię i nazwisko.
        zapisz_dane_do_pliku() — metoda zapisuje imię i
        nazwisko do pliku tekstowego o nazwie dane.txt .
        czytaj_dane_z_pliku() — metoda odczytuje dane
        z pliku dane.txt i wyświetla je na ekranie komputera.
*/