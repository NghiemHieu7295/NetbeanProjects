package java1_lab7;

public class SinhVienBiz extends SinhVien{
    private double diemMarketing;
    private double diemSales;

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
    public SinhVienBiz(){
        super();
        this.diemMarketing = 0.0;
        this.diemSales = 0.0;
    }
    
    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales){
        super(hoTen);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    
    @Override
    public double getDiem(){
        return (this.getDiemMarketing() * 2 + this.getDiemSales()) / 3;
    }
}