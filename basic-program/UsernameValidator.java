package com.gla;
import java.util.Scanner;

public class UsernameValidator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Username: ");
        String username = sc.nextLine();
        String regex = "^[A-Za-z][A-Za-z0-9_]{6,14}$";
        if(username.matches(regex)){
            System.out.println("Valid Username");
        }else{
            System.out.println("Invalid Username");
        }
    }
}
