package java1_lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai2 {
    ArrayList<SinhVien> list = new ArrayList<>();
    
    public void nhapDanhSachSinhVien(){
        Scanner nhap = new Scanner(System.in);
        
        while(true){
            System.out.print("Họ tên: ");
            String hoten = nhap.nextLine();
            System.out.print("Ngành: ");
            String nganh = nhap.nextLine();
            
            if(nganh.equalsIgnoreCase("IT")){
                SinhVienIT sv = new SinhVienIT();
                sv.setHoTen(hoten);
                sv.setNganh(nganh);
                
                System.out.print("Điểm Java: ");
                double diemjava = nhap.nextDouble();
                System.out.print("Điểm HTML: ");
                double diemhtml = nhap.nextDouble();
                System.out.print("Điểm CSS: ");
                double diemcss = nhap.nextDouble();
                
                sv.setDiemJava(diemjava);
                sv.setDiemHTML(diemhtml);
                sv.setDiemCSS(diemcss);
                
                list.add(sv);
            }
            else{
                SinhVienBiz sv = new SinhVienBiz();
                sv.setHoTen(hoten);
                sv.setNganh(nganh);
                
                System.out.print("Điểm Marketing: ");
                double diemmarketing = nhap.nextDouble();
                System.out.print("Điểm Sales: ");
                double diemsales = nhap.nextDouble();
                
                sv.setDiemMarketing(diemmarketing);
                sv.setDiemSales(diemsales);
                
                list.add(sv);
            }
            
            nhap.nextLine();
            System.out.print("Bạn có nhập nữa không? Y/N ");
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
            else{
                System.out.println();
                System.out.println("Mời bạn nhập tiếp.");
            }
        }
    }
    
    public void xuatDanhSachSinhVien(){
        for(SinhVien sv : list){
            sv.xuat();
            System.out.println();
        }
    }
    
    public void xuatDanhSachSinhVienGioi(){
        for(SinhVien sv : list){
            if(sv.getHocLuc().equalsIgnoreCase("Giỏi")){
                sv.xuat();
            }
        }
    }
    
    public void sapXepDanhSachSinhVienTheoDiem(){
        Scanner nhap = new Scanner(System.in);
        int luachon;
        
        System.out.println("1. Sắp xếp tăng dần.");
        System.out.println("2. Sắp xếp giảm dần.");
        
        System.out.print("Bạn muốn sắp xếp tăng dần hay giảm dần? ");
        luachon = nhap.nextInt();
        
        switch(luachon){
            case 1:
                Comparator<SinhVien> comp1 = new Comparator<SinhVien>(){
                    @Override
                    public int compare(SinhVien o1, SinhVien o2) {
                        if(o1.getDiem() > o2.getDiem()){
                            return 1;
                        }else if(o1.getDiem() < o2.getDiem()){
                            return -1;
                        }else{
                            return 0;
                        }
                    }
                };
                
                Collections.sort(list, comp1);
                break;
            case 2:
                Comparator<SinhVien> comp2 = new Comparator<SinhVien>(){
                    @Override
                    public int compare(SinhVien o1, SinhVien o2) {
                        if(o1.getDiem() > o2.getDiem()){
                            return -1;
                        }else if(o1.getDiem() < o2.getDiem()){
                            return 1;
                        }else{
                            return 0;
                        }
                    }
                };
                
                Collections.sort(list, comp2);
                break;
        }
    }
    
    public static void main(String[] args) {
        Bai2 obj = new Bai2();
        Scanner nhap = new Scanner(System.in);
        int luachon;
        
        while(true){
            System.out.println(">>             Quản lý sinh viên.             <<");
            System.out.println("+----------------------------------------------+");
            System.out.println("| 1. Nhập danh sách sinh viên.                 |");
            System.out.println("| 2. Xuất danh sách sinh viên.                 |");
            System.out.println("| 3. Xuất danh sách sinh viên có học lực giỏi. |");
            System.out.println("| 4. Sắp xếp danh sách sinh viên theo điểm.    |");
            System.out.println("| 5. Kết thúc.                                 |");
            System.out.println("+----------------------------------------------+");
            System.out.println(">>             Hãy chọn chức năng.            <<");
            
            luachon = nhap.nextInt();
            switch(luachon){
                case 1:
                    obj.nhapDanhSachSinhVien();
                    break;
                case 2:
                    obj.xuatDanhSachSinhVien();
                    break;
                case 3:
                    obj.xuatDanhSachSinhVienGioi();
                    break;
                case 4:
                    obj.sapXepDanhSachSinhVienTheoDiem();
                    break;
                case 5:
                    System.exit(0);
            }
            
            nhap.nextLine();
            System.out.print("Bạn có sử dụng chương trình tiếp không? Y/N ");
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}