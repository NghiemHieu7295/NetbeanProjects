package java2_lab1;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        int a, b, c, d;
        
        System.out.print("Nhập hệ số a: ");
        a = nhap.nextInt();
        System.out.print("Nhập hệ số b: ");
        b = nhap.nextInt();
        System.out.print("Nhập hệ số c: ");
        c = nhap.nextInt();
        
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phương trình có vô số nghiệm.");
                }
                else{
                    System.out.println("Phương trình vô nghiệm.");
                }
            }
            else{
                double x = (double) -c / b;
                System.out.println("Nghiệm của phương trình là: " + x);
            }
        }
        else{
            d = b*b - 4*a*c;
            if(d < 0){
                System.out.println("Phương trình vô nghiệm.");
            }else if(d == 0){
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: " + x);
            }
            else{
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1=: " + x1);
                System.out.println("x2=: " + x2);
            }
        }
    }   
}