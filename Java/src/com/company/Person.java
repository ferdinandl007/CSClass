package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Person {


    private String name;
    private String address;
    private Pet myPats[] = new Pet[5];
    private int numPats;

    public Person(String sName, String address) {
        name = sName;
        this.address = address;


    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public int getNumPats() {
        return numPats;
    }

    public void setNumPats(int numPats) {
        this.numPats = numPats;
    }

    public void setMyPats(Pet[] myPats) {
        this.myPats = myPats;
    }



    public Pet[] getMyPats() {
        return myPats;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    public void addPet(Pet m) {
        if (myPats.length <= 5){
            myPats[numPats] = m; // at end of array
            numPats++; // one more module
        } else {
            System.out.println("to manny pets");
        }

    }

   public String display() {
        return name + " " + address ;
   }


}
