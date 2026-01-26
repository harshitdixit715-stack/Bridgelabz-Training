import java.util.Scanner;

public class MarksThreeSubject {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter a physics marks : ");
        int physics = in.nextInt();
        System.out.println("Enter a chemistry marks : ");
        int chemistry = in.nextInt();
        System.out.println("Enter a maths marks : ");
        int maths = in.nextInt();
        double percentage = (physics+chemistry+maths)/3.0;
        System.out.println("Average Marks: " + percentage);
        if(percentage>80){
            System.out.println("Grade A");
            System.out.println("Level 4,Above agency-normalized standards");
        } 
        else if(percentage>=70 && percentage < 80){
            System.out.println("Grade B");
            System.out.println("Level 3, at agency-normalized satndards");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("Grade C");
            System.out.println("Remarks: Level 2,below,but approaching agency-normalized standards");
        }
        else if(percentage>=50 && percentage<60){
            System.out.println("Grade D");
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        }
        else if(percentage >= 40 && percentage<50){
            System.out.println("Grade E");
            System.out.println("Remarks: Level 1, too below agency-normalized standards");
        }
        else{
            System.out.println("Grade F");
            System.out.println("Remarks: Remedial standards");
        }

        in.close();
    }
}