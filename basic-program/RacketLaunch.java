import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter countdown number");
        int counter = in.nextInt();
        while(counter>=1){
            System.out.println(counter);
            counter--;
        }
        System.out.println("Launch");
        in.close();
    }
}