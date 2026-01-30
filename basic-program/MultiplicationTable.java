import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        for(int i=6;i<=9;i++){
            System.out.println(num+" * " + i + " = " + (num*i));
        }
        in.close();
    }
}