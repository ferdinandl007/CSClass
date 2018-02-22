package com.company;

public class Module {

    private int number;
    private String name;

    public Module(String Name, int number) {
        name = Name;
        this.number= number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public int getNumber() {
        return number;
    }

}
