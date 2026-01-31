import java.util.Scanner;

public class ProblemTwoArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] num = new int[5];
        for(int i=0;i<num.length;i++){
            System.out.println("Enter a number " + (i+1) + " :");
            num [i] = in.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if(num[i]>0){
                System.out.println(" Number is positive " + num[i]);
                if(num[i]%2 == 0){
                    System.out.println(" Number is even ");
                }
                else{
                    System.out.println(" Number is odd ");
                }
            }
            else if(num[i]<0){
                System.out.println(" Number is negative " + num[i]);
            }
            else{
                System.out.println(" Number is Zero ");
            }
        }
         System.out.println("\n Comparison first and last element: ");
         if(num[0] == num[num.length-1]){
            System.out.println("First and last elements are equal");
         }
         else if(num[0]>num[num.length-1]){
            System.out.println("First element is greater than last element");
         }
         else{
            System.out.println("First element is less than last element");
         }

         in.close();
    }
}