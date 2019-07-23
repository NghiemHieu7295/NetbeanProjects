package java1_lab2;

import java.util.Scanner;

public class Bai2 extends Bai1{
    
    public void GPTBN(int a, int b){
        double x;
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm.");
            }
            else{
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        else{
            x = -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
    }
    
    public void GPTBH(){
        Scanner nhap = new Scanner(System.in);
        int a, b, c, d;
        double x1, x2;
        
        System.out.println("Giải hệ phương trình bậc hai.");
        System.out.println("-----------------------------");
        System.out.print("Nhập hệ số a: ");
        a = nhap.nextInt();
        System.out.print("Nhập hệ số b: ");
        b = nhap.nextInt();
        System.out.print("Nhập hệ số c: ");
        c = nhap.nextInt();
        nhap.nextLine();
            
        if(a == 0){
            GPTBN(b, c); 
        }
        else{
            d = b * b - 4 * a * c;
            if(d < 0){
                System.out.println("Phương trình vô nghiệm");
            }
            else if(d == 0){
                System.out.println("Phương trình có nghiệm kép: " + 
                    -b / (2 * a));
            }
            else{
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm:\nx1=: "
                    + x1 + "\nx2=: " + x2);
            }
        }
    }  
}