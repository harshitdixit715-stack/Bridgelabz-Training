import java.util.Scanner;

public class SprintSeason {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a month ");
        int month = in.nextInt();
        System.out.println("Enter a day ");
        int day = in.nextInt();
        if((month == 3 && day >=20) || (month ==4) || (month == 5) || (month ==6 && day <=20)){
            System.out.println("Its a spring season");
        }
        else{
            System.out.println("not a spring season");
        }

        in.close();
    }
}
