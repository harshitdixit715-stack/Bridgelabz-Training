import java.util.Scanner;

public class MultipleNumberWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        if(number<=0 || number>=100){
            System.out.println("The number is positive and less then 100");
        }
        else{
            int counter = 99;
            while(counter>=number){
                if(counter % number == 0){
                    System.out.println(counter);
                }
            counter --;
            }
        }

        in.close();
    }
}