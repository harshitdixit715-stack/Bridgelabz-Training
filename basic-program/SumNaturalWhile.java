import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = in.nextInt();
        if(n>0){
            int SumWhile = 0;
            int i =0;

            while (i<=n){
                SumWhile = SumWhile+i;
                i++;
            }

            int sumFormula = n*(n+1)/2;

            System.out.println("Sum using while loop = " + SumWhile);
            System.out.println("Sum using formula n*(n+1)/2 = " + sumFormula);

            if(SumWhile == sumFormula){
                System.out.println("Result: Both computations are correct");
            }
            else{
                System.out.println("Result: Compuations are not correct");
            }
        }
        else{
                System.out.println("The entered number is not a natural number");
            }

        in.close();

    }
}