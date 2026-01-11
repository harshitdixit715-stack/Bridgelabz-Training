import java.util.Scanner;

public class PerimeterofaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter length l");
        double l = in.nextDouble();
        System.out.println("Please enter width l");
        double w = in.nextDouble();
        double Perimeter = 2*(l+w);
        System.out.println("perimeter of rectangle " + Perimeter);

        in.close();

    }
}