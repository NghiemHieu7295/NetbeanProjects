package java1_lab2;

import java.util.Scanner;

public class Bai1 {
    public void GPTBN(){
        Scanner nhap =  new Scanner(System.in);
        int a, b;
        double x;
        
        System.out.println("Giải phương trình bậc 1.");
        System.out.println("------------------------");
        System.out.print("Nhập hệ số a: ");
        a = nhap.nextInt();
        System.out.print("Nhập hệ số b: ");
        b = nhap.nextInt();
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else{
            x = (double) -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
        nhap.nextLine();
    }   
}