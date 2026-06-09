package com.gla;

public class Customer {
    String name;
    int cash;
    public Customer(String name, int cash){
        this.name = name;
        this.cash  = cash;

    }
    public void buy(Smartphone s1){
        System.out.println("Trying to buy the smartphone: "+s1);
    }
    @Override
    public String toString(){
        return this.name;
    }

}
