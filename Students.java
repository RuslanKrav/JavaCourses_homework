package com.company.lection4.homework4;

public class Students {
    private static Object Students;

    public static void main(String[] args) {
        Student student1 = new Student(1, "Alex", "Johnson", "Phyhology", 4.4, 2020);
        Student student2 = new Student(2, "Sergo", "Karrel", "Sport", 5.0, 2019);
        Student student3 = new Student(3, "Mary", "Salter", "Mathematics", 5.0, 2019);
        Student student4 = new Student(4, "John", "Grasp", "Music", 4.2, 2018);
        Student student5 = new Student(5, "Jack", "Ficus", "IT", 4.0, 2020);
        Student student6 = new Student(6, "Larry", "Black", "IT", 4.3, 2018);
        Student student7 = new Student(7, "Jess", "Derby", "English", 5.0, 2021);
        Student student8 = new Student(8, "Katty", "Reedus", "Business", 4.2, 2020);
        Student student9 = new Student(9, "Mike", "Bernthal", "Sport", 5.0, 2019);
        Student student10 = new Student(10, "Ron", "Side", "Physics", 4.2, 2020);
            System.out.println(student1.toString());
        }
}
