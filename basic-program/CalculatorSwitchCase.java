import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String op;
        System.out.println("Enter a first number");
        double first = in.nextDouble();
        System.out.println("Enter a Second number");
        double Second = in.nextDouble();
        System.out.println("Enter operator (+,-,*,/): ");
        op = in.next();

        switch(op){
            case"+":
            System.out.println("Result = "+(first+Second));
            break;
            case"-":
            System.out.println("Result = "+(first-Second));
            break;
            case"*":
            System.out.println("Result = "+(first*Second));
            break;
            case "/":
            if(Second!=0){
                System.out.println("Result = "+(first/Second));
            }
            else{
                System.out.println("Division by zero is not allow");
            }
            break;

            default:
                System.out.println("Invalid Operator");
        }

        in.close();
    }
}