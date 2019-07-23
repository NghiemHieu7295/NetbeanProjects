package java1_lab4;

import java.util.Scanner;

public class SanPham {
    public String tenSP;
    public double donGia;
    public double giamGia;
    
    public void setTenSP(String tenSP){
        this.tenSP = tenSP;
    }
    
    public String getTenSP(){
        return this.tenSP;
    }
    
    public void setDonGia(double donGia){
        this.donGia = donGia;
    }
    
    public double getDonGia(){
        return this.donGia;
    }
    
    public void setGiamGia(double giamGia){
        this.giamGia = giamGia;
    }
    
    public double getGiamGia(){
        return this.giamGia;
    }
    
    public SanPham(){
        this.tenSP = "";
        this.donGia = 0.0;
        this.giamGia = 0.0;
    }
    
    public SanPham(String tenSP, double donGia, double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public SanPham(String tenSP, double donGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        this.tenSP = nhap.nextLine();
        System.out.print("Đơn giá: ");
        this.donGia = nhap.nextDouble();
        System.out.print("Giảm giá: ");
        this.giamGia = nhap.nextDouble();
    }
    
    public double getThueNhapKhau(){
        double thue = this.donGia * 10 / 100;
        return thue;
    }
    
    public void xuat(){
        System.out.println("Tên sản phẩm: " + this.tenSP);
        System.out.println("Đơn giá: " + this.donGia);
        System.out.println("Giảm giá: " + this.giamGia);
        System.out.println("Thuế nhập khẩu: " + this.getThueNhapKhau());
    }
}