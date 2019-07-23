
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="sinhvien")
public class SinhVien implements Serializable {
    
    @Id
    @Column
    private String masv;
    @Column
    private String hoten;
    @Column
    private String gioitinh;
    @Column
    @Temporal(TemporalType.DATE)
    private Date ngaysinh;
    @Column
    private String quequan;
    @Column
    private String manganh;
    @Column
    private String makhoa;
    @Column
    private String malop;

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getManganh() {
        return manganh;
    }

    public void setManganh(String manganh) {
        this.manganh = manganh;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }
    
    @Override
    public String toString(){
        return masv + " " + hoten + " " + gioitinh + " " + DateUtils.formatDate(ngaysinh) + " " + 
                quequan + " " + manganh + " " + makhoa + " " + malop;
    }
}