package com.company;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {

    public static void main(String[] args) {

    Student myStudent = new Student("ferdinand",12);
    Module myModule = new Module("CS",1);

    System.out.println(myStudent.getName());
    System.out.println(myModule.getName());


    }
}
