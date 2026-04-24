package com.gla;
import java.util.Scanner;

public class ReplaceSpace {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String input  = sc.nextLine();
        //String input  = "This   is an    example   with    multiple    spaces.";
        String output = input.replaceAll("\\s+"," ");
        System.out.println(output);

    }
}
