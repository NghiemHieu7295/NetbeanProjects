package java1_lab6;

import java.util.Scanner;

public class Demo3 extends Thread{
    
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập 1 chuỗi nội dung bất kỳ: ");
        String content = nhap.nextLine();
        
        System.out.print("Nhập chuỗi cần thay thế: ");
        String find = nhap.nextLine();
        
        System.out.print("Nhập chuỗi thay thế: ");
        String replace = nhap.nextLine();
        
        String result = content.replace(find, replace);
        
        System.out.println(result);
    }   
}