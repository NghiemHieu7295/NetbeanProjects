package java1_lab3;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float mark;
        
        while(true){
            System.out.print("Nhập điểm: ");
            mark = scan.nextFloat();
            
            if((mark < 0) || (mark > 10)){
                System.out.println("Hãy nhập điểm từ 0 đến 10.");
            }
            else{
                break;
            }
        }
        
        System.out.println("Điểm vừa nhập là: " + mark);
    }   
}