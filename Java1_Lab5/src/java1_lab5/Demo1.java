package java1_lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        double tong = 0.0;
        
        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int n = nhap.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.print("a[" + (i + 1) + "]=: ");
            a.add(i, nhap.nextDouble());
            tong += a.get(i);
        }
        
        System.out.println("Tổng: " + tong);
    }   
}