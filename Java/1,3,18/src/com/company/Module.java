package com.company;

public class Module {
    private String number;
    private String name;
    private Student[] students;
    private int numStudents;


    public Module(String mName, String number, int maxStudents) {
        name = mName;
        this.number = number;
        students = new Student[ maxStudents  ];
        numStudents = 0;
    }





    public String getName() {
        return name;
    }
}