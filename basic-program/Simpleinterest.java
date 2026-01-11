import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter principal p");
        double p = in.nextDouble();
        System.out.println("Please enter rate r");
        double r = in.nextDouble();
        System.out.println("Please enter time (in year) t");
        double t = in.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("Simple Interest " + si);

        in.close();
    }
}
