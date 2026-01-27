import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();

        int sum = 0;
        int originalNumber = number;
        while(originalNumber != 0){
            int digit = originalNumber %10;
            sum = sum + (digit*digit*digit);
            originalNumber = originalNumber/10;
        }
        if(sum == number){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }


        in.close();
    }
}