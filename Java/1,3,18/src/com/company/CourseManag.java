package com.company;

public class CourseManag {

    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student("Mary", 1600000);
        Module m1 = new Module("OO Programming", "U08009", 150);
        Module m2 = new Module("Understanding Programing", "U08008", 100);
        Student s2 = new Student("Peter", 159999);
        s2.addModule(m2);
        s.addModule(m1);
        s.addModule(m2);
        System.out.println(s.getName()+ "is taking: ");
        s.displayModules();
        System.out.println(s2.getName()+ "is taking: ");
        s2.displayModules();
        s.deleteModule(0);
        System.out.println(s.getName()+ "is taking: ");
        s.displayModules();


    }

}
