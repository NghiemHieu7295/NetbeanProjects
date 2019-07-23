package java2_lab5;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập chuỗi bất kỳ thứ nhất: ");
        String s1 = nhap.nextLine();
        System.out.print("Nhập chuỗi bất kỳ thứ hai: ");
        String s2 = nhap.nextLine();
        
        try{
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println("Tổng hai số là: " + (a + b));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }   
}