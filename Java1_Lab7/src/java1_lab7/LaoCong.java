package java1_lab7;

public class LaoCong extends NhanVien{
    private double soGioLamViec;

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
    
    public LaoCong(){
        super();
        this.soGioLamViec = 0.0;
    }
    
    public LaoCong(String hoTen, double luong, double soGioLamViec){
        super(hoTen, luong);
        this.soGioLamViec = soGioLamViec;
    }
    
    @Override
    public double getThuNhap(){
        return this.getLuong() * this.getSoGioLamViec();
    }
    
    @Override
    public void xuat(){
        super.xuat();
    }
}