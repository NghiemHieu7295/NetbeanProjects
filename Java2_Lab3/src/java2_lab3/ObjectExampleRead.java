package java2_lab3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectExampleRead {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Stock[] stocks = (Stock[]) ois.readObject();
        System.out.println("Đọc từ file: ");
        for(Stock s : stocks){
            System.out.println(s);
        }
        ois.close();
        fis.close();
    }   
}