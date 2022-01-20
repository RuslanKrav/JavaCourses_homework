package com.company.lection4.homework4;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> list = new ArrayList<Student>();

    public Group() {}

    public void setStudent(Student student) {
        list.add(student);
    }

    public void getStudentByLastName(String LastName) {
        list.get(Integer.parseInt(LastName));
    }

    public void delStudentByLastName(String LastName) {
        list.remove(LastName);
    }
}
