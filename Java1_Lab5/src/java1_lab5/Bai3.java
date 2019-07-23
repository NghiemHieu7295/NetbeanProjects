package java1_lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai3 {
    ArrayList<SanPham> list = new ArrayList<>();
    
    public void nhapDanhSachSanPham(){
        Scanner nhap = new Scanner(System.in);
        while(true){
            SanPham sp = new SanPham();
            System.out.print("Tên sản phẩm: ");
            sp.setTenSP(nhap.nextLine());
            System.out.print("Giá sản phẩm: ");
            sp.setGiaSP(nhap.nextDouble());
            list.add(sp);
            
            System.out.print("Bạn có muốn nhập tiếp không? Y/N ");
            nhap.nextLine();
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
    }
    
    public void inDanhSachSanPham(){
        for(SanPham sp : list){
            System.out.println(sp.getTenSP() + " " + sp.getGiaSP());
        }
    }
    
    public void sapXepGiamDanVaInRaManHinh(){
        Collections.sort(list, (SanPham o1, SanPham o2) -> {
            if(o1.getGiaSP() > o2.getGiaSP()){
                return -1;
            }else if(o1.getGiaSP() < o2.getGiaSP()){
                return 1;
            }else{
                return 0;
            }
        });
        
        for(SanPham sp : list){
            System.out.println(sp.getTenSP() + " " + sp.getGiaSP());
        }
    }
    
    public void timVaXoaSanPhamTheoTen(){
        Scanner nhap = new Scanner(System.in);
        String tim;
        boolean found = false;
        
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        tim = nhap.nextLine();
        for(SanPham sp : list){
            if(sp.getTenSP().equalsIgnoreCase(tim)){
                System.out.println(sp.getTenSP() + " " + sp.getGiaSP());
                System.out.print("Bạn chắc chắn muốn xóa sản phẩm"
                        + " này? Y/N ");
                if(nhap.nextLine().equalsIgnoreCase("Y")){
                    list.remove(sp);
                }
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy sản phẩm này.");
        }
    }
    
    public void xuatGiaTrungBinhCacSanPham(){
        double tong = 0.0;
        for(SanPham sp : list){
            tong += sp.getGiaSP();
        }
        
        System.out.println("Giá trung bình của các sản phẩm là: "
        + tong / list.size());
    }
    
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        Bai3 obj = new Bai3();
        int luachon;
        
        while(true){
            System.out.println(">>               Quản lý sản phẩm.               <<");
            System.out.println("+-------------------------------------------------+");
            System.out.println("| 1. Nhập danh sách sản phẩm.                     |");
            System.out.println("| 2. In danh sách sản phẩm.                       |");
            System.out.println("| 3. Sắp xếp giảm dần theo giá và in ra màn hình. |");
            System.out.println("| 4. Tìm và xóa sản phẩm theo tên.                |");
            System.out.println("| 5. Xuất giá trung bình của các sản phẩm.        |");
            System.out.println("+-------------------------------------------------+");
            System.out.println(">>              Hãy chọn chức năng.              <<");
            luachon = nhap.nextInt();
            
            switch(luachon){
                case 1:
                    obj.nhapDanhSachSanPham();
                    break;
                case 2:
                    obj.inDanhSachSanPham();
                    break;
                case 3:
                    obj.sapXepGiamDanVaInRaManHinh();
                    break;
                case 4:
                    obj.timVaXoaSanPhamTheoTen();
                    break;
                case 5:
                    obj.xuatGiaTrungBinhCacSanPham();
                    break;
                default:
                    System.exit(0);
            }
            
            System.out.print("Bạn có muốn sử dụng chương trình"
                    + " tiếp không? Y/N ");
            nhap.nextLine();
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}