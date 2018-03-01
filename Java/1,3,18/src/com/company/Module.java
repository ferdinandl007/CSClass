package com.company;

import java.util.ArrayList;

public class Module {
    private String number;
    private String name;
    private ArrayList<Student> students;
    private int numStudents;


    public Module(String mName, String number, int maxStudents) {
        name = mName;
        this.number = number;
        students =  new ArrayList<>();
        numStudents = 0;
    }





    public String getName() {
        return name;
    }
}