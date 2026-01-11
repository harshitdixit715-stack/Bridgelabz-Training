import java.util.Scanner;

public class AreaOfaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a radius r: ");
        int r = in.nextInt();
        double pi = 3.14;
        double a = pi*r*r;
        System.out.println("Area of circle = " + a);

        in.close();
    }
}