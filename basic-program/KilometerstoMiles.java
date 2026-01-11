import java.util.Scanner;

public class KilometerstoMiles {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter distance (kilometer) x ");
       double x = in.nextDouble();
       double Miles = x * 0.621371;
       System.out.println("Distance in miles = " + Miles);

       in.close();
    }
}