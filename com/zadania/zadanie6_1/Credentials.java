package com.zadania.zadanie6_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

class Credentials {
    private String name;
    private String lastName;

    public Credentials(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public static Credentials mapCredentialsFromFile(String fileName) throws NoSuchFieldException {
        try {
            Scanner sc = new Scanner(new File(fileName));
            String firstName = null, lastName = null;
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim().toLowerCase(Locale.ROOT);

                if (line.startsWith("firstname")) {
                    firstName = line.replace("firstname", "");
                } else if (line.startsWith(("lastname"))) {
                    lastName = line.replace("lastname", "");
                }
            }

            if (firstName == null || lastName == null) {
                throw new NoSuchFieldException("missing file fields like first name or last name");
            }
            return new Credentials(firstName, lastName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public  String toString() {
        return "name = " + name + ", last name = " + lastName;
    }
}
