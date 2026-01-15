import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a base");
        int base = in.nextInt();
        System.out.println("Enter a height");
        int height = in.nextInt();
        double AreaOfaTriangleIninches = 0.5*base*height;
        double AreaOfaTriangleInCm = AreaOfaTriangleIninches * 6.4516 ;
        // 1 Square inch = 2.54*2.54
        System.out.println("Area of a Triangle in Sqaure inches is " + AreaOfaTriangleIninches + " Area of triangle in square cm is " + AreaOfaTriangleInCm);

        in.close();

    }
}