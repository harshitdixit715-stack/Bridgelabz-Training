import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        System.out.println("Enter a power");
        int power = in.nextInt();
        if(number<0 || power<0){
            System.out.println("Enter a positive number");
        }else{
            int result = 1;
            int counter = 0;
            while(counter<power){
                result = result*number;
                counter++;
            }
            System.out.println(number + " raised to the power " + power + " is " + result);

        }

        in.close();
    }
}