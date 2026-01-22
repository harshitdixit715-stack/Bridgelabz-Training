import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        if(num<0){
            System.out.println("Factorial is not define for negative number");
        }
        else{
            long fact = 1;
            int i=1;

            while(i<=num){
                fact = fact*i;
                i++;
            }
            System.out.println("Factorial " + num + " is "+fact);
        }

        in.close();
    }
}