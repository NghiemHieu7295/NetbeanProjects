package java1_lab4;

import java.util.Scanner;

public class Sinhvien {
    public String hoten;
    public double diemTB;
    public String hocluc;
    
    public Sinhvien(){
        this.hoten = "";
        this.diemTB = 0.0;
    }
    
    public Sinhvien(String hoten, double diemTB){
        this.hoten = hoten;
        this.diemTB = diemTB;
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập họ tên sinh viên: ");
        this.hoten = nhap.nextLine();
        System.out.print("Nhập điểm trung bình của sinh viên: ");
        this.diemTB = nhap.nextDouble();
    }
    
    public void xeploai(){
        if(this.diemTB < 5){
            this.hocluc = "Yếu";
        }else if(this.diemTB >= 5 && this.diemTB < 6.5){
            this.hocluc = "Trung bình";
        }else if(this.diemTB >= 6.5 && this.diemTB < 7.5){
            this.hocluc = "Khá";
        }else if(this.diemTB >= 7.5 && this.diemTB < 9){
            this.hocluc = "Giỏi";
        }else{
            this.hocluc = "Xuất sắc";
        }
    }
    
    public void xuat(){
        System.out.println("Sinh viên:\n" + this.hoten);
        System.out.println("Điểm trung bình: " + this.diemTB);
        System.out.println("Học lực: " + this.hocluc);
    }
}