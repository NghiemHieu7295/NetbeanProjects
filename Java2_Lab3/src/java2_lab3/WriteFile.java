package java2_lab3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        File file = new File("test.txt");
        try{    
            FileWriter out = new FileWriter(file);
            out.write("Đọc, ghi dữ liệu trong java.");
            out.write("\n");
            out.write("Sử dụng stream character");
            out.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }   
}