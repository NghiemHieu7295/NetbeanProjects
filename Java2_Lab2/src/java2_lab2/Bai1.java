package java2_lab2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        
        for(int i = 0; i < a.length; i++){
            System.out.print("a[" + (i + 1) + "]=: ");
            a[i] = nhap.nextInt();
            sum += a[i];
        }
        
        System.out.println("Tổng các phần tử trong mảng: " + sum);
        
        try{
            a[5] = nhap.nextInt();
            sum += a[5];
        }catch(Exception e){
            System.out.println("Vượt quá kích thước mảng.\n" + e);
        }
        System.out.println(sum);
    }
}