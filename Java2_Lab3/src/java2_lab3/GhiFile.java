package java2_lab3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class GhiFile {

    public static void main(String[] args) throws IOException{
        File file = new File("test.txt");
        if(file.exists()){}
        else{
            file.createNewFile();
        }
        
        FileOutputStream fos = new FileOutputStream(file);
        
        String s = "Hello World. This is my first I/O program.";
        
        fos.write(s.getBytes());
        fos.close();
        System.out.println("Ghi dữ liệu xong.");
    }   
}