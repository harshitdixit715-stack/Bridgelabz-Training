package com.gla;
import java.util.Scanner;

public class CensorBad {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String input = sc.nextLine();
        String[] badWords = {"damn", "stupid"};
        for (String word : badWords) {
            input = input.replaceAll("(?i)\\b" + word + "\\b", "****");
            System.out.println(input);
        }
    }
}
