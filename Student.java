package com.company.lection4.homework4;

public class Student extends Human{
    int ID;
    String Faculty;
    double Rate;
    int Year;

    public Student(int ID, String name, String lastName, String Faculty, double Rate, int Year) {
        super(name, lastName);
        this.ID = ID;
        this.Faculty = Faculty;
        this.Rate = Rate;
        this.Year = Year;
    }
    public String toString() {
        return getName() + " " + getLastName()+ " " + Rate;
    }
}
