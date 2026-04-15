import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class TryWithResource {
    static void main(String[] args) {
        try (BufferedReader bufferreader = new BufferedReader(new FileReader("info.txt"))){
        String line = bufferreader.readLine();
        if (line != null) {
            System.out.println("line");
        } else {
            System.out.println("Empty file");
        }
    }catch(IOException e){
            System.out.println("Error reading file");
        }
   }
}
