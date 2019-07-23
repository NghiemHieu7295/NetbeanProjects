package java2_lab3;

import java.io.File;
import java.io.IOException;

public class TaoFile {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        
        if(file.exists()){}
        else{
            file.createNewFile();
        }
    }   
}