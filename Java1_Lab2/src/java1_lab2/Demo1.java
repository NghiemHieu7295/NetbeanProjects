package java1_lab2;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;
        
        while(true){
            System.out.print("Nhập một số bất kỳ: ");
            x = scan.nextDouble();
            
            if(x > 0){
                break;
            }
            else{
                System.out.println("Xin mời nhập lại. Phải là số dương.");
                System.out.println();
            }
        }
        
        System.out.println("Căn bậc 2 của số vừa nhập là: " + Math.sqrt(x));
    }   
}