package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {


    public static void main(String[] args) {
        exercise5();




    }





    static void exercise5(){
        ArrayList<String> a  = new ArrayList<>();
        ArrayList<String> b  = new ArrayList<>();
        a.add("Jam");
        b.add("Jam");
        if (a.get(0)==b.get(0)) {
            System.out.println("ArrayLists are equal");
        } else {
            System.out.println("ArrayLists are not equal");
        }

    }




    static void ExerciseFour(){
        ArrayList<String> a;
        ArrayList<String> b;
        a = new ArrayList<>();
        b = a;
        a.add("Jam");
        b.add("Spam");
        if (a==b) {
            System.out.println("ArrayLists are equal");
        } else {
            System.out.println("ArrayLists are not equal");
        }
        System.out.println("a.get(0) = " + a.get(0));
        System.out.println("b.get(0) = " + b.get(0));
    }










}
