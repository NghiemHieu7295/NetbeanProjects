package java1_lab3;

import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Nhập số phần tử của mảng: ");
        byte n = scan.nextByte();
        
        short[] arr = new short[n];
        
        for(byte i = 0; i < n; i++){
            System.out.print("arr[" + i + "]=: ");
            arr[i] = scan.nextShort();
            sum += arr[i];
        }
        
        System.out.println("Trung bình cộng của mảng là: " + (double) sum / n);
        
        for(byte i = 0; i < n; i++){
            System.out.println(arr[i] + "^3 = " + Math.pow(arr[i], 3));
        }
    }   
}