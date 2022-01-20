package com.company.lection4.homework4;

public class Human {
        private String lastName;
        private String name;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public Human(String lastName, String name) {
                this.lastName = lastName;
                this.name = name;
        }

}
