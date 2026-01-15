import java.util.Scanner;

public class DistanceInYard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a distance in yard ");
        double Distanceinfeet = in.nextDouble();
        double yard = Distanceinfeet/3;
        double miles = yard/1760;
        System.out.println("Distance in yards in " + Distanceinfeet + " While in yards " + yard + " and in miles is " + miles);

        in.close();
    }
}