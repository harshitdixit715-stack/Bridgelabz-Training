import java.util.Scanner;

public class Quotientandreminder {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number 1");
      int number1 = in.nextInt();
      System.out.println("Enter a number 2");
      int number2 = in.nextInt();
      double quotient = (double) number1/number2;
      double remainder = number1%number2;
      System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " +  number1 + " and " + number2);
      
      in.close();
    }
}