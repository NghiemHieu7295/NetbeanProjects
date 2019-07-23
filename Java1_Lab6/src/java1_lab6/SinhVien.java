package java1_lab6;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String email;
    private String dienThoai;
    private String cmnd;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        
        while(true){
            System.out.print("Họ tên: ");
            String hoten = nhap.nextLine();
            
            if(hoten.matches("[a-zA-Z ]+")){
                this.setHoTen(hoten);
                break;
            }
            else{
                System.out.print("Họ tên không hợp lệ.\nHọ tên chỉ"
                        + " chứa các chữ cái và ký tự trắng.\n");
            }
        }
        
        while(true){
            System.out.print("Email: ");
            String studentEmail  = nhap.nextLine();
            
            if(studentEmail.matches("\\w+@\\w+\\.\\w+")){
                this.setEmail(studentEmail);
                break;
            }
            else{
                System.out.print("Email không hợp lệ.\n"
                        + "Email phải chứa 1 ký tự @.\n");
            }
        }
        
        while(true){
            System.out.print("Số điện thoại: ");
            String soDienThoai = nhap.nextLine();
            
            if(soDienThoai.matches("0[0-9]{9}")){
                this.setDienThoai(soDienThoai);
                break;
            }
            else{
                System.out.print("Số điện thoại không hợp lệ.\n"
                        + "Số điện thoại phải gồm 10 chữ số.\n");
            }
        }
        
        while(true){
            System.out.print("Số chứng minh nhân dân: ");
            String soCmnd = nhap.nextLine();
            
            if(soCmnd.matches("\\d{9}")){
                this.setCmnd(soCmnd);
                break;
            }
            else{
                System.out.print("Số chứng minh thư không hợp lệ.\n"
                        + "Số chứng minh thư phải gồm 9 chữ số.\n");
            }
        }
    }
    
    public void xuat(){
        System.out.println("Họ tên sinh viên: " + this.getHoTen());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Số điện thoại: " + this.getDienThoai());
        System.out.println("Chứng minh nhân dân: " + this.getCmnd());
        System.out.println();
    }
}