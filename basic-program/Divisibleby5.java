import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int Number = in.nextInt();
        if(Number%5==0){
            System.out.println("Is the number " + Number + " Divisible by 5");
        }
        else {
            System.out.println("Is the number " + Number + " not divisible by 5");
        }

        in.close();
    }
}