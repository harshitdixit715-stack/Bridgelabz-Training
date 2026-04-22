package com.gla;
import java.util.Scanner;
public class CapitalWord {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String word = sc.nextLine();
        String regex = "^[A-Z][a-z]{3,8}$";
        if(word.matches(regex)){
            System.out.println("Valid word");
        }else{
            System.out.println("Invalid word");
        }
    }
}
