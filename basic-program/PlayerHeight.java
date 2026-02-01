import java.util.Scanner;

public class PlayerHeight {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double [] height = new double[11];  
       double sum = 0.0;
       System.out.println("Enter the height of 11 football players: ");
       for(int i=0;i<height.length;i++){
        height[i] = in.nextDouble();
        sum = sum+height[i];
       }
       double mean = sum/height.length;
       System.out.println("Mean height of the football team = "+ mean);


       in.close();

    }
}