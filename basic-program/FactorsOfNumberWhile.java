import java.util.Scanner;

public class FactorsOfNumberWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        if(n<=0){
            System.out.println("Enter a positive number");
        }else{
            int counter = 1;
            System.out.println("Factors of " + n + " are ");
        while(counter<n){
            if(n%counter==0){
                System.out.println(counter);
            }
            counter++;

          }
        }
        in.close();
    }
}