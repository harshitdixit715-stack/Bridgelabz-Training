import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        System.out.println("Enter a power");
        int power = in.nextInt();
        if(number<0 || power<0){
            System.out.println("Enter a Positive number" );
        }
        else{
            int result = 1;
            for(int i=1;i<=power;i++){
                result = result*number;
            }
            System.out.println(number + " raised to the power "+ power + " is " + result);
        }

        in.close();
    }
}