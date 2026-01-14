public class UniversityFees {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int discount = (fee*discountPercent)/100;
        int discountedfee = fee-discount;
        System.out.println("By subtracting the discount from the fee " + discountedfee);
    }
}