import java.util.Scanner;

public class PositiveNegative{
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    int Number = in.nextInt();

    if(Number>0){
        System.out.println("Positive");
    }
    else if(Number<0) {
        System.out.println("Negative");
    }

    in.close();
    }
}