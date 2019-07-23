package java2_lab5;

import java.util.Scanner;
import static java.lang.Math.*;

public class Bai1 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập số a: ");
        int a = nhap.nextInt();
        System.out.print("Nhập số b: ");
        int b = nhap.nextInt();
        
        System.out.println("Căn bậc 2 của a: " + sqrt(a));
        System.out.println("a mũ b bằng: " + pow(a, b));
        System.out.println("Max giữa 2 số bằng: " + max(a, b));
        System.out.println("Min giữa 2 số bằng: " + min(a, b));
    }   
}