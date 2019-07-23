package java1_lab7;

public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    
    public TruongPhong(){
        super();
        this.trachNhiem = 0.0;
    }
    
    public TruongPhong(String hoTen, double luong, double trachNhiem){
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    
    @Override
    public double getThuNhap(){
        return super.getThuNhap() + this.getTrachNhiem() * 30;
    }
    
    @Override
    public void xuat(){
        super.xuat();
    }
}