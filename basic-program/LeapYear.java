import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = in.nextInt();
        if(year<1582){
            System.out.println("According to Gregorian calender");
        }
        else if((year%4==0 && year%100!=0)|| (year%400 == 0)){
            System.out.println("Year is leap Year");
        }
        else{
            System.out.println("Year is not leap Year");
        }

        in.close();
    }
}