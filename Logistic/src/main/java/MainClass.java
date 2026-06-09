import java.util.Scanner;

public class MainClass {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DriverDetail driver = new DriverDetail("D1", "Shivam");
        driver.routeHistory.addCheckpoint(
                new Delivery("C1", "Delhi", 50, 60, 80)
        );
        driver.routeHistory.addCheckpoint(
                new Fuel("C2", "Gurgaon", 20, 30, 40)
        );
        driver.routeHistory.addCheckpoint(
                new Fuel("C3", "Jaipur", 100, 60, 100)
        );

        driver.routeHistory.printRoute();

        System.out.println("Total Distance: " +
                driver.routeHistory.computeTotalDistance());

        System.out.println("Total Penalty: " +
                driver.routeHistory.computeTotalPenalty());

        System.out.println("Route Score: " +
                driver.getRouteScale());

        System.out.println("Is Consistent: " +
                driver.routeHistory.isConsistent());

    }
}
