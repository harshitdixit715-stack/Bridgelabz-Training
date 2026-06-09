package com.gla;

public class Smartphone {
    String modelName;
    int price;
    String colour;
    public Smartphone(String modelName,int price,String colour){
        this.modelName = modelName;
        this.price = price;
        this.colour = colour;
    }
    @Override
    public String toString(){
        return this.modelName+" "+this.colour+" "+this.price;
    }
}
