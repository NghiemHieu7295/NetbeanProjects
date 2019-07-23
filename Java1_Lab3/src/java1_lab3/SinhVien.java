package java1_lab3;

public class SinhVien {
    private String hoten;
    private byte tuoi;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public byte getTuoi() {
        return tuoi;
    }

    public void setTuoi(byte tuoi) {
        this.tuoi = tuoi;
    }
    
    @Override
    public String toString(){
        return this.getHoten() + " " + this.getTuoi();
    }
}