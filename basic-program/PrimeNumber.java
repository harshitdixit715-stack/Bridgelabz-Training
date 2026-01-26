import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a  number");
        int number = in.nextInt();
        boolean prime = true;
        if(number<=1){
            prime = false;
        }
        else{
            for(int i=2;i<number;i++){
                if (number % i == 0){
                    prime = false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println(number + " Is a prime number");
        }
        else{
            System.out.println(number + " is not a prime Number");
        }

        in.close();
    }
}