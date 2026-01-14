public class CostandSelling {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        double Profit = sellingPrice - costPrice;
        double profitPercentage = Profit/costPrice * 100;
        System.out.println("The Cost price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" + "The Profit in INR " + Profit + " and the Profit Percentage is " + profitPercentage );
    }
}