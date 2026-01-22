import java.util.Scanner;

public class ThreeNumber{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a first number");
    int number1 = in.nextInt();
    System.out.println("Enter a second number");
    int number2 = in.nextInt();
    System.out.println("Enter a third number");
    int number3 = in.nextInt();
    boolean isSmallest = number1<number2 && number1<number3;
    System.out.println("Is the first number is smallest " + isSmallest );

    in.close();

  }
}