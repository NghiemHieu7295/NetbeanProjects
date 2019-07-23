package java2_lab3;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        String manvPattern = "[^\\s]+";
        String hotenPattern = "[a-zA-z ]+";
        String tuoiPattern = "[0-9]+";
        String luongPattern = "[0-9]+";
        String manv, hoten, tuoi, luong;
        
        while(true){
            System.out.print("Nhập mã nhân viên: ");
            manv = nhap.nextLine();

            if(manv.matches(manvPattern)){
                break;
            }
            else{
                System.out.println("Mã nhân viên không được chứa ký"
                        + " tự trắng.\nXin mời nhập lại.");
            }
        }
        
        while(true){
            System.out.print("Nhập họ tên: ");
            hoten = nhap.nextLine();

            if(hoten.matches(hotenPattern)){
                break;
            }
            else{
                System.out.println("Họ tên chỉ chứa các chữ cái và"
                        + " ký tự trắng.\nXin mời nhập lại.");
            }
        }
        
        while(true){
            System.out.print("Nhập tuổi: ");
            tuoi = nhap.nextLine();

            if(tuoi.matches(tuoiPattern)){
                break;
            }
            else{
                System.out.println("Xin hãy nhập số.\nXin mời nhập lại.");
            }
        }
        
        while(true){
            System.out.print("Nhập lương: ");
            luong = nhap.nextLine();

            if(luong.matches(luongPattern)){
                break;
            }
            else{
                System.out.println("Xin hãy nhập số.\nXin mời nhập lại.");
            }
        }
        
        NhanVien nv1 = new NhanVien();
        nv1.setMaNv(manv);
        nv1.setHoTen(hoten);
        nv1.setTuoi(Integer.parseInt(tuoi));
        nv1.setLuong(Float.parseFloat(luong));
        
        System.out.println();
        System.out.println("Mã nhân viên: " + nv1.getMaNv());
        System.out.println("Họ tên: " + nv1.getHoTen());
        System.out.println("Tuổi: " + nv1.getTuoi());
        System.out.println("Lương: " + nv1.getLuong());
        
        System.out.println();
        NhanVien nv2 = new NhanVien("E002", "Nghiem Manh Tuan", 24, 8000000);
        System.out.println(nv2.toString());
    }   
}