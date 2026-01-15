import java.util.Scanner;

public class PerimeterOFsquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a perimeter of Square");
        double Perimeter = in.nextDouble();
        double side = Perimeter/4;
        System.out.println("The Length of side is "+ side +  " whose perimeter is " + Perimeter);

        in.close();
    }
}