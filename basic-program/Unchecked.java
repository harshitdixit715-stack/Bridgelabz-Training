package com.gla;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Unchecked {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter a second number: ");
            int num2 = sc.nextInt();
            int divide = num1 / num2;
            System.out.println("divide: " + divide);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero.");
        }
        catch(InputMismatchException e){
            System.out.println("Error: Please enter numeric values only.");
        }
        finally {
            sc.close();
        }
    }
}