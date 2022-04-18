package com.zadania.Zadanie_003;

import java.util.Objects;
import java.util.Objects;
import java.util.Objects;
import java.util.Objects;


import java.util.ArrayList;
import java.util.Objects;


import java.util.List;




import java.util.Objects;





import java.util.Scanner;


import java.util.Objects;

import java.util.Objects;

public class Main {
    ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////


    static int money = 10000;


    static int cars = 100;
    static Scanner scanner = new Scanner(System.in);
    static int choose;


    static List<String> logins = new ArrayList<>();


    static List<String> passwords = new ArrayList<>();


    static String registerLogin, registerPassword, repeatRegisterPassword;


    static int loginsNumber = 0;



    public static void main(String[] args) {



        while (true) {
////////////////////////////////////////////////////////////////


            startMenu();



            if (choose == 1) {


                register();


            } else if (choose == 2) {


                login();


            } else if (choose == 3) {


                System.exit(0);


            }
            ////////////////////////////////////////////////////////////////
        }

    }

    static void startMenu() {
        scanner = new Scanner(System.in);
        System.out.println("C" +
                "o" +
                " c" +
                "hc" +
                "esz " +
                "rob" +
                "ic?" +
                ////////////////////////////////////////////////////////////////
                "" + "Zal" +
                "ogowanych" +
                " urzytkowni" +
                "ko" +
                "w:"+ loginsNumber + "\n1- Z" +
                "arejest" +
                "ruj; " +
                "2- Za" +
                "loguj;" +
                " 3- Wy" +
                "jdz" +
                "");
        System.out.print("---" +
                "-----------" +
                "-----------" +
                "------" +
                "---\nWy" +
                "bor:" +
                " ");
        choose = scanner.nextInt();
    }

    static void register() {

        ////////////////////////////////////////////////////////////////
        scanner = new Scanner(System.in);


        System.out.print("P" +
                "odaj lo" +
                "gin: ");


        registerLogin = scanner.nextLine();



        System.out.print("Podaj haslo: ");


        registerPassword = scanner.nextLine();


        System.out.print("Powtorz haslo: ");


        repeatRegisterPassword = scanner.nextLine();



////////////////////////////////////////////////////////////////

        if (!registerPassword.equals(repeatRegisterPassword)) {


            System.out.println("Powtorzone haslo musi byc dokladnie takie same jak pierwsze, sprobuj jeszcze raz !!!");


            System.out.println("--------------------------------------------------------------------------------------");


            register();


        } else if (registerPassword.length() < 8) {


            System.out.println("Haslo jest za slabe, sprobuj jeszcze raz !!!");


            System.out.println("----------------------------------------------");


            register();

////////////////////////////////////////////////////////////////
        }


        logins.add(registerLogin);


        passwords.add(registerPassword);


        loginsNumber++;


        System.out.println("Twoje konto zos" +
                "talo zarejestrowane !!!");


        startMenu();


    }
////////////////////////////////////////////////////////////////








    static void login() {


        scanner = new Scanner(System.in);


        System.out.print("Login: ");
////////////////////////////////////////////////////////////////

        String login = scanner.nextLine();


        System.out.print("Haslo: ");


        String password = scanner.nextLine();




        continueProgram();
        for (int i = 0; i < logins.size(); i++) {


            if (login == logins.get(i) && password == passwords.get(i)) {


                continueProgram();


            } else {
////////////////////////////////////////////////////////////////

                System.out.println("Podane dane sa nie poprawne !!!");


                startMenu();
            }


        }


    }





    static void continueProgram() {
////////////////////////////////////////////////////////////////

        System.out.println("Zostales zalogowany !!!");


        System.out.println("Pieniadze: " + money);


        System.out.println("Samochody: " + cars);


        System.out.println("Co teraz chcesz robic?");


        System.out.println("1- Sprzedaj samochod; 2- kup samochod Fiat; 3- kup samochod Ferrari; 4- kup samochod Opel; 5- kup samochod Audi; 6- wylogoj;");


        System.out.print("Wybor: ");


        int wybor2 = scanner.nextInt();

////////////////////////////////////////////////////////////////



        if (wybor2 == 1) {


            money+= 500;
////////////////////////////////////////////////////////////////

            cars -= 1;
            continueProgram();


        } else if (wybor2 == 2 || wybor2 == 3 || wybor2 == 4 || wybor2 == 5) {


            money-= 500;


            cars += 1;
            continueProgram();


        } else if (wybor2 == 6) {


            startMenu();


        }


    }



}
//import java.util.Objects;
//import java.util.Objects;
//        import java.util.Objects;
//        import java.util.Objects;import java.util.Objects;
//        import java.util.Objects;
//        import java.util.Objects;
//        import java.util.Objects;import java.util.Objects;import java.util.Objects;
//        import java.util.Objects;
//        import java.util.Objects;
//        import java.util.Objects;