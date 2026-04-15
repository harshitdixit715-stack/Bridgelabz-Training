package com.gla;

import java.util.Scanner;
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}
     class AgeValidator {
         public static void validateAge(int age) throws InvalidAgeException {
             if (age < 18) {
                 throw new InvalidAgeException("Age must be 18 or above");
             } else {
                 System.out.println("Access granted!");
             }
         }


         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter a age: ");
             int age = sc.nextInt();
             try {
                 AgeValidator.validateAge(age);
             } catch (InvalidAgeException e) {
                 System.out.println(e.getMessage());
             }
             sc.close();
         }
     }
