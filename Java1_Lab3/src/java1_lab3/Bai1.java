package java1_lab3;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        boolean OK = true;
        System.out.print("Nhập số n: ");
        int n = nhap.nextInt();
        for(int i = 2; i < (n - 1); i++){
            if((n % i) == 0){
                OK = false;
                break;
            }
        }
        if(OK){
            System.out.println(n + " là số nguyên tố.");
        }
        else{
            System.out.println(n+ " không phải là số nguyên tố.");
        }
    }   
}