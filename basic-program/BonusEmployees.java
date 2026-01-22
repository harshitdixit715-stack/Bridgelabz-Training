import java.util.Scanner;

public class BonusEmployees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Salary in Rupees");
        double Salary = in.nextDouble();
        System.out.println("Enter Year of service");
        int year  = in.nextInt();

        double Bonus = 0;
        if(year>5){
            Bonus = Salary*0.05;
        }
        System.out.println("Bonus Amount "+ Bonus);

        in.close();

    }
}