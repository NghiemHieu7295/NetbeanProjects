package java1_lab6;

import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập 1 chuỗi chứa các số: ");
        String chuoi = nhap.nextLine();
        
        String[] dayso = chuoi.split(",");
        
        for(String so : dayso){
            if(Integer.parseInt(so) % 2 == 0){
                System.out.print(so + " ");
            }
        }
    }   
}