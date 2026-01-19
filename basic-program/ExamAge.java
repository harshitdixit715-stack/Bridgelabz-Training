import java.util.Scanner;

public class ExamAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a age ");
        int age = in.nextInt();
        if (age>=18 && age<30){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }

        in.close();
    }
}