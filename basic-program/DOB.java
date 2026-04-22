package com.gla;
import java.util.Scanner;

public class DOB {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DOB: ");
        String dob = sc.nextLine();
        String regex = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[0-2])\\/(19|20)\\d{2}$";
        if(dob.matches(regex)){
            System.out.println("Valid dob");
        }else{
            System.out.println("Invalid dod");
        }
    }
}
