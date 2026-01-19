import java.util.Scanner;

public class SumnNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        int sum = number*(number+1)/2;
        if(number>0){
            System.out.println("The sum of "+ number + " natural number is " + sum);
        }
        else{
            System.out.println("The number " + number + "is not natural number");
        }

        in.close();
    }
}