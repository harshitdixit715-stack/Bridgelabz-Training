import java.util.Scanner;

public class MainClass {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. DeliveryCheckpoint – Warehouse A – Delayed – Penalty: ");
        System.out.println("2. FuelCheckpoint – Pump 12 – On Time – Penalty: ");
        System.out.println("3. RestCheckpoint – Motel X – Delayed – Penalty: ");
        System.out.println("4. DeliveryCheckpoint – Client Hub – Delayed – Penalty: ");



        System.out.println("Total Distance in Km : ");
        int distanceFromLast =  sc.nextInt();

        System.out.println("Total Penalty : ");
        int penalty = sc.nextInt();

        System.out.println("Route Score : ");
        int Score = sc.nextInt();

    }
}





//Driver: D1204 – Kavita Nair
//Route Summary:
//        1. DeliveryCheckpoint – Warehouse A – Delayed – Penalty: 20.0
//        2. FuelCheckpoint – Pump 12 – On Time – Penalty: 0.0
//        3. RestCheckpoint – Motel X – Delayed – Penalty: 2.5
//        4. DeliveryCheckpoint – Client Hub – Delayed – Penalty: 30.0
