import java.util.Scanner;

public class CheckThreeNumber {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in); 
    System.out.println("Enter a first number");
    int number1 = in.nextInt();
    System.out.println("Enter a second number");
    int number2 = in.nextInt();
    System.out.println("Enter a third number");
    int number3 = in.nextInt();
    boolean firstNumber  = number1>number2 && number1>number3;
    boolean secondNumber  = number2>number1 && number2>number3;
    boolean thirdNumber  = number3>number1 && number3>number2;
    System.out.println("Is the first number the largest " + firstNumber + "\n" +"Is the second number the largest " + "\n"+ secondNumber + "\n" + "Is the third number the largest " + thirdNumber);

    in.close();
    }
}