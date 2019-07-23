package java2_lab3;

import java.io.Serializable;

public class NhanVien implements Serializable{

    private String maNv;
    private String hoTen;
    private int tuoi;
    private float luong;

    public NhanVien(){
        this.maNv = null;
        this.hoTen = null;
        this.tuoi = 0;
        this.luong = 0.0F;
    }
    
    public NhanVien(String maNv, String hoTen, int tuoi, float luong){
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luong = luong;
    }
    
    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    @Override
    public String toString(){
        return this.maNv + " " + this.hoTen + " " + this.tuoi + " " + this.luong;
    }
}