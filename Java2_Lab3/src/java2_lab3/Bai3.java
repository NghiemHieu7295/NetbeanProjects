package java2_lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bai3 {

    public static void main(String[] args) {
        File file = new File("test/nhanvien.txt");
        
        try{
            FileReader in = new FileReader(file);
            int ch = in.read();
            
            while(ch != -1){
                System.out.print((char) ch);
                ch = in.read();
            }
            
            System.out.println("Đã đọc xong.");
            in.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Không tìm thấy file này.");
        }
        catch (IOException e) {
            System.out.println("Có lỗi.");
        }
    }   
}