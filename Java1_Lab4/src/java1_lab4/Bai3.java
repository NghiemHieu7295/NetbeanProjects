package java1_lab4;

public class Bai3 {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        
        sp1.setTenSP("Chocolate");
        sp1.setDonGia(109000);
        sp1.setGiamGia(9000);
        
        sp2.setTenSP("Milk");
        sp2.setDonGia(55000);
        sp2.setGiamGia(5000);
        
        System.out.println("Tên sản phẩm: " + sp1.getTenSP());
        System.out.println("Đơn giá: " + sp1.getDonGia());
        System.out.println("Giảm giá: " + sp1.getGiamGia());
        System.out.println("Thuế nhập khẩu: " + sp1.getThueNhapKhau());
        System.out.println();
        System.out.println("Tên sản phẩm: " + sp2.getTenSP());
        System.out.println("Đơn giá: " + sp2.getDonGia());
        System.out.println("Giảm giá: " + sp2.getGiamGia());
        System.out.println("Thuế nhập khẩu: " + sp2.getThueNhapKhau());
    }   
}