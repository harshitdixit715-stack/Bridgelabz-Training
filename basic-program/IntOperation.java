import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number a");
        int a = in.nextInt();
        System.out.println("Enter a number b");
        int b = in.nextInt();
        System.out.println("Enter a number c");
        int c = in.nextInt();
        double x = a+b*c;
        double y = a*b+c;
        double z = c+a/b;
        double u = a%b+c;
        System.out.println("The result of int Operator are " + x + "," + y + "," + z + " and " + u);
        
        in.close();
    }
}