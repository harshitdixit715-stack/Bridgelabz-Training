import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int GreatestFactor = 1;
        if(n>1){
            for(int i=n-1;i>=1;i--){
                if(n%i==0){
                    GreatestFactor = i;
                    break;
                }
            }

            System.out.println("Greatest factor of "+ n + " beside itself is : " + GreatestFactor );
        }
        else{
            System.out.println("Enter a number Greater than 1 ");
        }
        in.close();
    }
}