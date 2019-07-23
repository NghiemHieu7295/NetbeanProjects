package java1_lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        double tong = 0.0;
        
        System.out.println("Mời nhập số:");
        while(true){
            Double x = nhap.nextDouble();
            a.add(x);
            
            System.out.print("Nhập thêm? (Y/N) ");
            nhap.nextLine();
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        
        for(Double x : a){
            tong += x;
        }
        
        System.out.println("Tổng của các số trong list là: " + tong);
    }   
}