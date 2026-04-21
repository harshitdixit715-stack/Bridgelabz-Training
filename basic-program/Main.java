package BankTransaction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000);

        System.out.print("Enter withdrawl amount: ");
        double amount = sc.nextDouble();

        try {
            account.withdrawl( amount);
        } catch (Custom e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
