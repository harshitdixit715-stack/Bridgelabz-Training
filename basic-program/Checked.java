package com.gla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Checked {
    static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("data.text"));
            String line;
            System.out.println("File Contents");
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("File not found");
        }
    }

}
