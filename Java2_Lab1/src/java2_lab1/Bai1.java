package java2_lab1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập bán kính: ");
        double r = nhap.nextDouble();
        
        System.out.println("Chu vi của hình tròn là: " + 2 * Math.PI * r);
        System.out.println("Diện tích của hình tròn là: " + Math.PI * Math.pow(r, 2));
    }   
}