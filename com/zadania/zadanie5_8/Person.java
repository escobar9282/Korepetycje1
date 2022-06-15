package com.zadania.zadanie5_8;

import java.util.Scanner;

public class Person {
    private String lastName;
    private String firstName;
    private String street;
    private int postalCode;
    private String town;

    public Person(String lastName, String firstName, String street, int postalCode, String town) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.street = street;
        this.postalCode = postalCode;
        this.town= town;
    }

    public Person(){

    }
    public void initialize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        setFirstName(sc.nextLine());
        System.out.println("Enter last name");
        setLastName(sc.nextLine());
        System.out.println("Enter street name");
        setStreet(sc.nextLine());
        System.out.println("Enter postal code");
        setPostalCode(sc.nextInt());
        sc.nextLine();
        System.out.println("enter name of town");
        setTown(sc.nextLine());
    }
    public void showInformationAboutUser() {
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getStreet());
        System.out.println(getPostalCode());
        System.out.println(getTown());
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public  String getLastName(){
        return lastName;
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

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getFirstName(){
        return firstName;
    }
}
    /*Napisz program, w którym zdefiniowano klasę osoba
, zawierającą następujące pola: nazwisko , imię , ulica , kod , miasto
        oraz dwie metody: inicjuj() i drukuj() . Pierwsza z nich umożliwia
        wprowadzenie danych, natomiast druga wyświetla je na ekranie komputera.*/
