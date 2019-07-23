package java2_lab3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
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
        
        File file = new File("test/nhanvien.txt");
        
        try{
            if(file.exists()){}
            else{
                file.createNewFile();
                System.out.println("Đã tạo file mới.");
            }

            FileWriter out = new FileWriter(file);

            for(NhanVien nv : list){
                out.write(nv.toString());
                out.write("\n");
            }
            System.out.println("Đã ghi xong.");
            out.close();
        }
        catch(IOException e){
            System.out.println("Có lỗi đã xảy ra.\n" + e);
        }
    }   
}