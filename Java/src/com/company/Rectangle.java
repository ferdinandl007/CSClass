package com.company;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height) {
        super(0,0);
        this.width = width;
        this.height = height;
    }

    @Override
    public void move(double x, double y) {
        super.move(x, y);
    }

    public void scale(double factor){
        this.width = this.width * factor;
        this.height = this.height * factor;
    }


    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

}
