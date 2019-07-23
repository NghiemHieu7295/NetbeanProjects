package java2_lab6;

import java.util.ArrayList;

public class Bai2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
        System.out.println("Đã nhập xong.");
        System.out.println();
        
        int i = 0;
        do{
            System.out.println(list.get(i));
            i++;
        }while(i < 10);
    }   
}