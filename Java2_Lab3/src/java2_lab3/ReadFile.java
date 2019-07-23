package java2_lab3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        File file = new File("test.txt");
        
        try{
            FileReader input = new FileReader(file);
            System.out.println("Đọc từ file test.txt");
            int ch = input.read();
            while(ch != -1){
                System.out.print((char) ch);
                ch = input.read();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println();
    }   
}