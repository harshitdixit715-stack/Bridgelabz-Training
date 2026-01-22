import java.util.Scanner;

public class YoungestFriend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Amar age");
        int Amarage = in.nextInt();
        System.out.println("Enter Amar Height");
        int AmarHeight = in.nextInt();
        System.out.println("Enter Akbar age");
        int Akbarage = in.nextInt();
        System.out.println("Enter Akbar Height");
        int AkbarHeight = in.nextInt();
        System.out.println("Enter Anthony age");
        int Anthonyage = in.nextInt();
        System.out.println("Enter Anthony Height");
        int AnthonyHeight = in.nextInt();

        if(Amarage <= Akbarage && Amarage <= Anthonyage){
            System.out.println("Youngest friend is Amar");
        }
        else if(Akbarage<=Amarage && Akbarage<=Anthonyage){
            System.out.println("Youngest friend is Akbar");
        }else{
            System.out.println("Youngest friend is Anthony");
        }

        if(AmarHeight >= AkbarHeight && AmarHeight >= AnthonyHeight){
            System.out.println("Tallest friend is Amar");
        }
        else if(AkbarHeight>=AmarHeight && AkbarHeight>=AnthonyHeight){
            System.out.println("Tallest friend is Akbar");
        }else{
            System.out.println("Tallest friend is Anthony");
        }

        in.close();
    }
}