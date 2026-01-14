import java.util.Scanner;

public class UserInputUniversity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a student fee ");
        int fee = in.nextInt();
        System.out.println("Enter a discountPercentage ");
        int discountPercent = in.nextInt();
        int discount = (fee*discountPercent)/100;
        int discountedfee = fee-discount;
        System.out.println("By subtracting the discount from the fee " + discountedfee);

        in.close();
    }
}