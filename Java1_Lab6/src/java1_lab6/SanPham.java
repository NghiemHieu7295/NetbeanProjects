package java1_lab6;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private String hang;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Tên sản phẩm: ");
        this.setTenSP(nhap.nextLine());
        
        System.out.print("Giá: ");
        this.setDonGia(nhap.nextDouble());
        
        nhap.nextLine();
        
        System.out.print("Hãng: ");
        this.setHang(nhap.nextLine());
    }
    
    public void xuat(){
        System.out.println("Tên sản phẩm: " + this.getTenSP());
        System.out.println("Giá: " + this.getDonGia());
        System.out.println("Hãng: " + this.getHang());
    }
}