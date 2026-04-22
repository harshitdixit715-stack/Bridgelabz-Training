package com.gla;
import java.util.Scanner;

public class Email {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mail: ");
        String mail = sc.nextLine();
        String regex = "^[a-za-z0-9\\W]{8,30}$";
        if(mail.matches(regex)){
            System.out.println("Valid Mail");
        }else{
            System.out.println("Invalid Mail");
        }
    }
}
