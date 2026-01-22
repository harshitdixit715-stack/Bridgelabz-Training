import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = in.nextInt();
       if(n>0){
        int formulaSum = n*(n+1)/2;
        int loopSum = 0;
        for(int i=1;i<=n;i++){
            loopSum = loopSum+i;
        }
        System.out.println("Sum using formula " + formulaSum);
        System.out.println("Sum using for loop " + loopSum);

        if(formulaSum == loopSum){
            System.out.println("Both results are correct and equal");

        }
        else{
            System.out.println("Result are not equal");
        }
       }
       else{
        System.out.println("The entered number is not a natural number");
       }

       in.close();
    }
}