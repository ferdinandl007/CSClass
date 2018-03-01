package com.company;

public class Pet {

    private String name;
    private String race;
    private String type;
    private int age;


    public Pet(String sName,String sRace,String sType, int number) {
        name = sName;
        race = sRace;
        type = sType;
        this.age = number;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getType() {
        return type;
    }

    public void display() {
       System.out.println( name + " " + race + " " + type + " " + age);
    }




}
