package java1_lab3;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String hocluc;
        System.out.print("Nhập số lượng sinh viên: ");
        int n = nhap.nextInt();
        nhap.nextLine();
        
        String[] hoten = new String[n];
        double[] diem = new double[n];
        
        for(int i = 0; i < hoten.length; i++){
            System.out.println("Họ tên sinh viên thứ " + (i + 1)
            + ":");
            hoten[i] = nhap.nextLine();
        }
        
        for(int i = 0; i < diem.length; i++){
            System.out.println("Điểm của sinh viên thứ " + (i + 1)
            + ":");
            diem[i] = nhap.nextDouble();
        }
        
        for(int i = 0; i < hoten.length; i++){
            if(diem[i] < 5){
                hocluc = "Yếu";
            }else if(diem[i] >=5 && diem[i] < 6.5){
                hocluc = "Trung bình";
            }else if(diem[i] >= 6.5 && diem[i] < 7.5){
                hocluc = "Khá";
            }else if(diem[i] >= 7.5 && diem[i] < 9){
                hocluc = "Giỏi";
            }
            else{
                hocluc = "Xuất sắc";
            }
            System.out.println("Sinh viên thứ " + (i + 1)
            + ": " + hoten[i]);
            System.out.print(" Điểm: " + diem[i]);
            System.out.println(" Học lực: " + hocluc);
        }
        
        for(int i = 0; i < (n - 1); i++){
            for(int j = 1; j < n; j++){
                if(diem[i] > diem[j]){
                    String temp = hoten[j];
                    hoten[j] = hoten[i];
                    hoten[i] = temp;
                    
                    double tam = diem[j];
                    diem[j] = diem[i];
                    diem[i] = tam;
                }
            }
        }
        
        System.out.println("Danh sách sinh viên tăng dần theo điểm: ");
        for(int i = 0; i < n; i++){
            System.out.print(hoten[i] + " ");
            System.out.println(diem[i]);
        }
    }   
}