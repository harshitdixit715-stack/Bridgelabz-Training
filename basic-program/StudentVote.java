import java.util.Scanner;

public class StudentVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] age = new int[10];
        for(int i=0;i<age.length;i++){
        System.out.println("Enter a age " + (i+1) + ":");
        age[i] = in.nextInt();
      }
      System.out.println("\n---Voting Eligibility Result---");
      for(int i=0;i<age.length;i++){
        if(age[i]<0){
            System.out.println("Invalid age");
        }
        else if(age[i]>=18){
            System.out.println("The student with the age "+ age[i] + " can vote");
        }
