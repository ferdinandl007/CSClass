package com.company;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(0,0);
        this.radius = radius;

    }


    @Override
    public void move(double x, double y) {
        super.move(x, y);
    }
    public void scale(double factor){
        this.radius = this.radius * factor;

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
