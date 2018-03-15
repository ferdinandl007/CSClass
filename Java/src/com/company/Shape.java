package com.company;

public abstract class Shape implements IShape , Moveable {
    private double x, y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter();

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double newX) {
        x = newX;
    }

    public void move(double x, double y){
        this.x = x;
        this.y = y;
    }



    public void setY(double newY) {
        y = newY;
    }


}
