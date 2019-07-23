package java1_lab2;

import java.util.Scanner;

public class Bai3 extends Bai2{
    
    public void Tinhtiendien(){
        Scanner nhap = new Scanner(System.in);
        int sodien, tiendien;
        System.out.print("Nhập số điện: ");
        sodien = nhap.nextInt();
        
        if(sodien <= 50){
            tiendien = sodien * 1000;
        }
        else{
            tiendien = (50 * 1000) + (sodien - 50) * 1200;
        }
        
        System.out.println("Tiền điện: " + tiendien);
    }   
}