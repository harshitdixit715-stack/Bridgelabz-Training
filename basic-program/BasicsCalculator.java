import java.util.Scanner;

public class BasicsCalculator {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
       System.out.println("Enter a number 1 ");
        float number1 = in.nextFloat();
        System.out.println("Enter a number 2");
        float number2 = in.nextFloat();
        float Add = number1+number2;
        float sub = number1-number2;
        float mul = number1*number2;
        float div = number1/number2;
        System.out.println("The Addition,Subtraction,multiplication and divide value of 2 numbers " + number1 + " and " + number2 + " is " + Add + "," + sub + "," + mul + " and " + div );

        in.close();
    }
}