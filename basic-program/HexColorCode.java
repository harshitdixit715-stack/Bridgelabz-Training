package com.gla;
import java.util.Scanner;

public class HexColorCode {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String hexcode = sc.nextLine();
        String regex = "^#[0-9A-Za-f]{6}$";
        if(hexcode.matches(regex)){
            System.out.println("Valid code");
        }else{
            System.out.println("Invalid code");
        }

    }
}
