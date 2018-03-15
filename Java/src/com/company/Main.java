package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Main {


    public static void printShape(IShape r) {

        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());

    }


    public static void main(String[] args) {
	// write your code here
        ArrayList<Shape> shapes = new ArrayList<>();


        Shape r = new Rectangle(10,20);

        Shape  c = new Circle(20);

        shapes.add(r);
        shapes.add(c);


        for (Shape i: shapes){
            print(i,"not move and Scalet -> ");
            i.move(1,2);
            i.scale(3);
            print(i,"");

        }

    }

    static void print(Shape i, String r){
        System.out.println(r + i.getArea() );
        System.out.println(r + i.getPerimeter());
    }








}






