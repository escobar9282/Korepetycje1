package com.zadania.zadanie5_9;

import java.util.Scanner;

public class Cadre extends Person{
    private String position, education;

    public Cadre() {

    }

    protected void initialize1(){
        super.initialize();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is tour position");
        position = sc.nextLine();
        System.out.println("What is Your education");
        education = sc.nextLine();
    }

    public void showUserInformation1() {
        super.showUserInformation();
        System.out.println(position);
        System.out.println(education);
    }

    public String getPosition(){
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getEducation(){
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
    /*Na bazie zadania 5.8 napisz program, w którym zostanie
     zawarty proces dziedziczenia — klasa nadrzędna kadra
     będzie dziedziczyć właściwości po klasie bazowej osoba
      oraz będzie zawierać dwa dodatkowe pola: wykształcenie
       i stanowisko oraz dwie dodatkowe metody: inicjuj1()
       i drukuj1() .
     */
