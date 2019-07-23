package java1_lab4;

public class Bai2 {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Milo", 56000, 10000);
        SanPham sp2 = new SanPham("Chocopie", 52000);
        
        sp1.xuat();
        System.out.println();
        sp2.xuat();
    }   
}