//import java.util.IOException;
package BankTransaction;

 public class BankAccount {
     private double balance;
     public BankAccount(double balance){
         this.balance = balance;
     }
     public void withdrawl(double amount) throws Custom{
         if(amount<0){
             throw new  IllegalArgumentException("Invalid amount!");
         }
         if(amount>balance){
             throw new Custom ("Insufficient balance!");
         }
         balance -= amount;
         System.out.println("Withdrawal successful, new balance: " + balance);
     }
}
