package java1_lab6;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập họ tên: ");
        String hoten = nhap.nextLine();
        
        String ho = hoten.substring(0, hoten.indexOf(" "));
        String ten = hoten.substring(hoten.lastIndexOf(" "));
        String dem = hoten.substring(hoten.indexOf(" "), hoten.lastIndexOf(" ")+1);
        
        System.out.println("Họ: " + ho.toUpperCase());
        System.out.println("Đệm: " + dem);
        System.out.println("Tên: " + ten.toUpperCase());
    }   
}