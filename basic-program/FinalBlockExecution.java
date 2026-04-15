import java.util.Scanner;

public class FinalBlockExecution {
    static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first integer: ");
            int num1 = sc.nextInt();

            System.out.println("Enter second integer: ");
            int num2 = sc.nextInt();

            int division = num1/num2;
            System.out.println("Division: "+ division);
        }catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero");
        }finally{
            System.out.println("Operation completed");
        }

    }
}
