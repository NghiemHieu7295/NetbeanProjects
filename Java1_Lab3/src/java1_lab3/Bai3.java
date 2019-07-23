package java1_lab3;

//import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = nhap.nextInt();
        
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            System.out.print("a[" + (i + 1) + "]=: ");
            a[i] = nhap.nextInt();
        }
        
        //Arrays.sort(a);
        int min = a[0];
        int count = 0, sum = 0;
        double avg;
        
        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        
        for(int i = 0; i < a.length; i++){
            if((a[i] % 3) == 0){
                count++;
                sum += a[i];
            }
        }
        
        avg = (double) sum / count;
        
        System.out.println("Phần tử nhỏ nhất của mảng là: " + min);
        System.out.println("Trung bình cộng của các phần tử chia "
                + "hết cho 3 là: " + avg);
    }   
}