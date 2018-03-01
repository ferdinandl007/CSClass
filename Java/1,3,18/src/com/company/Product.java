package com.company;


import java.util.ArrayList;

public class Product {

    private String name;
    private double price;

    public Product(String mName) {
        name = mName;
        price = 0.0;

    }


    public void setPrice(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }
}



