package java2_lab3;

import java.io.File;
import java.io.IOException;

public class TaoFileTrongThuMuc {

    public static void main(String[] args) throws IOException {
        File dir = new File("test");
        if(dir.exists()){}
        else{
            dir.mkdir();
        }
        
        File file = new File("test/test.txt");
        if(file.exists()){}
        else{
            file.createNewFile();
            System.out.println("Tạo file thành công.");
        }
    }   
}