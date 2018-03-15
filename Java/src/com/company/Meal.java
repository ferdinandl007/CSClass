package com.company;

import java.util.ArrayList;

public class  Meal implements Ingredients,IPrice {
    private String name;
    private Double price;
    private ArrayList<Ingredient>  ingredient;


    public void addIngredient(Ingredient i){
        ingredient.add(i);
    }


    @Override
    public ArrayList<Ingredients> getIngredients() {
        return ingredient;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
