import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        double km;
        double miles;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a distance in kilometer");
        km = input.nextInt();
        miles = km/1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + "km");

        input.close();
    }
}