package java2_lab3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class Bai4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<NhanVien> list = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        
        String manvPattern = "[^\\s]+";
        String hotenPattern = "[a-zA-z ]+";
        String tuoiPattern = "[0-9]+";
        String luongPattern = "[0-9]+";
        String manv, hoten, tuoi, luong;
        
        for(int i = 0; i < 3; i++){
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
            
            NhanVien nv = new NhanVien(manv, hoten, Integer.parseInt(tuoi), Float.parseFloat(luong));
            list.add(nv);
            System.out.println();
        }
        
        FileOutputStream fos = new FileOutputStream("test/nhanvien.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for(NhanVien nv : list){
            oos.writeObject(nv);
            oos.writeChars("\n");
        }
        
        System.out.println("Đã ghi xong.");
        oos.close();
        fos.close();
    }   
}