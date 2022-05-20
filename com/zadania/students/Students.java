package com.zadania.students;

public class Students {
    public static int amountOfStudents = 24;
    public String name;
    public int age;
    public String ID;
    public int grade;

    public Students(String name, int age, String ID, int grade) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public void introduce() {
        System.out.println(this.ID + "This is students ID" + this.name + "Students name" + this.age + "Students age" + this.grade + "Students grade");
    }
}
