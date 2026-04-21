package com.gla;
import java.util.Scanner;

public class LicencePlate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Vechile number: ");
        String platenumber = sc.nextLine();
        String regex = "^[A-Z][A-Z0-9]{4,6}$";
        if(platenumber.matches(regex)){
            System.out.println("Valid number");
        }else{
            System.out.println("Invalid number");
        }

    }
}
