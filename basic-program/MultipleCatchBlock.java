package com.gla;


import java.util.Scanner;
public class MultipleCatchBlock {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Index: ");
        int[] arr = {30,40,50,60,70};
        int index = sc.nextInt();
        try{
            int value = arr[index];
            System.out.println("Value of index "+ index + "," + value);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
        sc.close();
    }
}
