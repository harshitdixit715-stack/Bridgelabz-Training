import java.util.Scanner;

public class MultiplesNumber {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a number");
       int number = in.nextInt();
       if(number<=0 || number>=100){
        System.out.println("The number is positive and less then 100");
       } 
       else{
            System.out.println("Multiples of " + number + " below 100 ");
       }
       for(int i=100;i>=1;i--){
        if(i%number == 0){
            System.out.println(i);
        }
       }
       in.close();
    }
}