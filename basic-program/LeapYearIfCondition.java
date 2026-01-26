import java.util.Scanner;

public class LeapYearIfCondition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Year");
        int Year = in.nextInt();
        if(Year>=1582 && (Year%400 == 0 || (Year%4 == 0 && Year %100!=0))){
            System.out.println("Year is Leap Year");
        }
        else{
            System.out.println("Year is not Leap Year");
        }

        in.close();
    }
}