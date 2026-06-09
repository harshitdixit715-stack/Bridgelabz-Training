package com.gla;
import java.io.IOException;

public class Practice {
    static void main(String[] args) throws IOException {
        Smartphone s1 = new Smartphone("Iphone 13",70000,"White");
        Smartphone s2 = new Smartphone("Iphone 12",60000,"red");
        Smartphone s3 = new Smartphone("galaxy",85000,"black");
        Smartphone s4 = new Smartphone("Motorola",150000,"Pink");

        Employee e1 = new Employee("Sangam",1);
        Employee e2 = new Employee("Sharad",2);
        Employee e3 = new Employee("Shivam",3);

        Customer cm1 = new Customer("A",80000);
        Customer cm2 = new Customer("B",90000);
        Customer cm3 = new Customer("C",40000);

       // cm1.buy(s1);
        //e1.sellphone(cm1, s1);


        //cm2.buy(s4);
        //e2.sellphone(cm2, s4);

        cm3.buy(s2);
        e2.sellphone(cm3, s2);
    }
}
