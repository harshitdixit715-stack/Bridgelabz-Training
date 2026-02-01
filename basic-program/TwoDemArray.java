import java.util.Scanner;

public class TwoDemArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a rows");
        int row = in.nextInt();
        System.out.println("Enter a column");
        int col = in.nextInt();
        int [][] matrix = new int[row][col];
        System.out.println("Enter matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        int [] array = new int[row*col];
        int index = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array [index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("1D array elements: ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        in.close();

    }
}