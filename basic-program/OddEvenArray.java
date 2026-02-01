import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int num = in.nextInt();
        if(num<=0){
            System.out.println("Error: Enter a natural number");
            return;
        }
        int [] even = new int [num/2+1];
        int [] odd = new int [num/2+1];

        int evenIndex = 0;
        int oddIndex = 0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                even[evenIndex] = i;
                evenIndex++;
            }
            else{
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.println("odd number :");
        for(int i= 0; i<oddIndex;i++){
            System.out.println(odd[i]);
        }
        System.out.println("Even Number : ");
        for(int i=0;i<evenIndex;i++){
            System.out.println(even[i]);
        }

        
        in.close();
    }
}