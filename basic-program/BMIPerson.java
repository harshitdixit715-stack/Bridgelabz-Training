import java.util.Scanner;

public class BMIPerson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight in kg");
        double weight = in.nextDouble();
        System.out.println("Enter height in cm");
        double height = in.nextDouble();
        double heightCm = height/100; 
        double formulaBMI = weight/(heightCm*heightCm);
        if(formulaBMI<=18.4){
            System.out.println("Underweight");
        } 
        else if(formulaBMI>=18.5 && formulaBMI<=24.9){
            System.out.println("Normal");
        }
        else if(formulaBMI>=25.0 && formulaBMI<=39.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obase");
        }

        in.close();
    }
}