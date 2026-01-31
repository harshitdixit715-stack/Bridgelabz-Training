import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int[] MultiplicationResult = new int[4];
        int index = 0;
        for(int i=6;i<=9;i++){
            MultiplicationResult[index] = num*i;
            index++; 
        }
        index = 0;
        for(int i=6;i<=9;i++){
            System.out.println(num + " * " + i + " = " + MultiplicationResult[index]);
            index++;
        }

        in.close();
    }
}