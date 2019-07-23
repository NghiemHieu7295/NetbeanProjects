package java1_lab7;

public class NhanVien {
    private String hoTen;
    private double luong;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public NhanVien(){
        this.hoTen = "";
        this.luong = 0.0;
    }
    
    public NhanVien(String hoTen, double luong){
        this.hoTen = hoTen;
        this.luong = luong;
    }
    
    public double getThuNhap(){
        return this.getLuong() * 30;
    }
    
    public void xuat(){
        System.out.println("Họ tên: " + this.getHoTen());
        System.out.println("Thu nhập: " + this.getThuNhap());
    }
}