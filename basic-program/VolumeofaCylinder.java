import java.util.Scanner;

public class VolumeofaCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a radius r");
        int r = in.nextInt();
        System.out.println("Please enter a height h");
        int h = in.nextInt();
        double pi = 3.14;
        double v = pi*r*r*h;
        System.out.println("Volume of a cylinder= " + v);

        in.close();
    }
}
