package java1_lab4;

public class Bai1 {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        
        sp1.nhap();
        System.out.println();
        sp2.nhap();
        System.out.println();
        sp1.xuat();
        System.out.println();
        sp2.xuat();
    }   
}