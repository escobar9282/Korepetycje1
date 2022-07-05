package com.zadania.zadanie5_9;

import java.util.Scanner;

public class Person {
    private String lastName, firstName, street, postalCode, city;

    public Person() {

    }

    public void initialize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last name");
        lastName = sc.nextLine();
        System.out.println("Entere firs name");
        firstName = sc.nextLine();
        System.out.println("Enter street name");
        street = sc.nextLine();
        System.out.println("Enter postal code");
        postalCode = sc.nextLine();
        System.out.println("Enter Your city");
        city = sc.nextLine();
    }

    public void showUserInformation() {
        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(street);
        System.out.println(postalCode);
        System.out.println(city);
    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
   /* Napisz program, w którym zdefiniowano klasę osoba ,
    zawierającą następujące pola: nazwisko , imię , ulica ,
        kod , miasto oraz dwie metody: inicjuj() i drukuj() .
        Pierwsza z nich umożliwia wprowadzenie danych, natomiast
        druga wyświetla je na ekranie komputera.*/
