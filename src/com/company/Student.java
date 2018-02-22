package com.company;

import sun.dc.pr.PRError;

public class Student {

    private int number;
    private String name;
    private String course;
    private Module studying[] = new Module[5];
    private int numStudying; // 0 .. 5

    public Student(String sName, int number) {
        name = sName;
        this.number= number;

    }
    public void changeCourse(String nCourse) {
        course = nCourse;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public void addModule(Module m) {
        studying[numStudying] = m; // at end of array
        numStudying++; // one more module
    }

    public void deleteModule(int pos) {
        int i = pos;
        while (i<numStudying-1) {
            studying[i] = studying[i+1]; // copy down
            i++;
        } // i == numStudying-1
        numStudying--; // one less now
    }


}
