import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= in.nextInt();
        int count = 0;
        if(number==0){
            count = 1;
        }
        while(number!=0){
            number = number/10;
            count++;
        }
        System.out.println("Number of digit =" + count);

        in.close();
    }
}