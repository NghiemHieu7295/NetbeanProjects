package java1_lab7;

public abstract class SinhVien {
    private String hoTen;
    private String nganh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public SinhVien(){
        this.hoTen = "";
        this.nganh = "";
    }
    
    public SinhVien(String hoTen){
        this.hoTen = hoTen;
    }
    
    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    abstract public double getDiem();
    
    public String getHocLuc(){
        String hocluc;
        
        if(this.getDiem() < 5){
            hocluc = "Yếu";
        }else if(this.getDiem() >= 5 && this.getDiem() < 6.5){
            hocluc = "Trung bình";
        }else if(this.getDiem() >= 6.5 && this.getDiem() < 7.5){
            hocluc = "Khá";
        }else if(this.getDiem() >= 7.5 && this.getDiem() < 9){
            hocluc = "Giỏi";
        }else{
            hocluc = "Xuất sắc";
        }
        
        return hocluc;
    }
    
    public void xuat(){
        System.out.println("Họ tên: " + this.getHoTen());
        System.out.println("Ngành: " + this.getNganh());
        System.out.println("Điểm: " + this.getDiem());
        System.out.println("Học lực: " + this.getHocLuc());
    }
}