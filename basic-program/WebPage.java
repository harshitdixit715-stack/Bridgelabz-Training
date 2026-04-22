package com.gla;
import java.util.Scanner;

public class WebPage {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Wed site: ");
        String website  = sc.nextLine();
        String regex = "^https?:\\/\\/[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if(website.matches(regex)){
            System.out.println("Valid Wedsite: ");
        }else{
            System.out.println("Not Valid wedsite: ");
        }
    }
}
