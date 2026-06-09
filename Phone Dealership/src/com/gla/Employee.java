package com.gla;

public class Employee {
    String name;
    int id;
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void sellphone(Customer cm, Smartphone s){
        if(cm.cash>=s.price){
            System.out.println("Sold the smartphone to the customer:  "+cm);
        }
        else{
            emi(cm,s);
        }
    }
    public void emi(Customer cm, Smartphone s){
        double emi = (s.price*1.0)/12.0;
        System.out.println("The 12 month emi for buying this smartphone will be: "+emi);
    }
}
