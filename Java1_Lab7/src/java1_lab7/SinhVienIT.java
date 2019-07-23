package java1_lab7;

public class SinhVienIT extends SinhVien{
    private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }
    
    public SinhVienIT(){
        super();
        this.diemJava = 0.0;
        this.diemHTML = 0.0;
        this.diemCSS = 0.0;
    }
    
    public SinhVienIT(String hoTen, double diemJava, double diemHTML, double diemCSS){
        super(hoTen);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }
    
    @Override
    public double getDiem(){
        return (this.getDiemJava() * 2 + this.getDiemHTML() + this.getDiemCSS()) / 4;
    }
}