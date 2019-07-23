package java2_lab3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Bai5 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("test/nhanvien.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        System.out.print(ois.readObject());
        System.out.print(ois.readChar());
        System.out.print(ois.readObject());
        System.out.print(ois.readChar());
        System.out.print(ois.readObject());
        System.out.print(ois.readChar());
        
        System.out.println("Đã đọc xong.");
        ois.close();
        fis.close();
    }   
}