package java2_lab3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DocFile {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if(file.exists()){}
        else{
            file.createNewFile();
        }
        
        FileInputStream fis = new FileInputStream(file);
        
        int c = fis.read();
        
        while(c != -1){
            System.out.print((char) c);
            c = fis.read();
        }
        
        fis.close();
        System.out.println();
        System.out.println("Đã đọc xong file.");
    }   
}