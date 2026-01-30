import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int GreatestFactor = 1;
        if(n>1){
            int counter = n-1;
            while(counter>=1){
                if(n%counter==0){
                    GreatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("Greatest factor of " + n + " beside itseft is: " + GreatestFactor);
        }
        else{
            System.out.println("Enter a number greater than 1");
        }
        in.close();
    }
}