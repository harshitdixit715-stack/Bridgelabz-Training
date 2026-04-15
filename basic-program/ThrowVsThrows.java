import java.util.Scanner;

public class ThrowVsThrows {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        double interest = (amount * rate * years) / 100;
        return interest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter year: ");
            int year = sc.nextInt();

        try{
                double result = calculateInterest(amount, rate, year);
                System.out.println("Calculated Interest: " + result);

            } catch(IllegalArgumentException e){
                System.out.println("Invalid input: Amount and rate must be positive");
            }
        sc.close();
    }
}
