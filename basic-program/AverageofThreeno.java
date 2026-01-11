import java.util.Scanner;

public class AverageofThreeno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number a ");
        double a = in.nextDouble();
        System.out.println("Enter second number b ");
        double b = in.nextDouble();
        System.out.println("Enter Third number c ");
        double c = in.nextDouble();
        double average = (a+b+c)/3.0;
        System.out.println("Average of three number =  " + average);

        in.close();
    }
}