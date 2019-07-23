package java1_lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien{
    public String hoTen;
    public double diemTb;
}

public class Demo2 {
    int n;
    ArrayList<SinhVien> a = new ArrayList<>();
    
    public void nhapDanhSach(){
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập số lượng sinh viên: ");
        n = nhap.nextInt();
        nhap.nextLine();
        
        for(int i = 0; i < n; i++){
            a.add(new SinhVien());
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("------------------------------");
            System.out.print("Họ tên: ");
            a.get(i).hoTen = nhap.nextLine();
            System.out.print("Điểm trung bình: ");
            a.get(i).diemTb = nhap.nextDouble();
            System.out.println();
            nhap.nextLine();
        } 
    }
    
    public void nhapThemSinhVien(){
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập số lượng sinh viên thêm vào: ");
        int m = nhap.nextInt();
        nhap.nextLine();
        
        for(int i = 0; i < m; i++){
            a.add(new SinhVien());
            System.out.println("Sinh viên thứ " + a.size() + ":");
            System.out.println("----------------------------------");
            System.out.print("Họ tên: ");
            a.get(a.size() - 1).hoTen = nhap.nextLine();
            System.out.print("Điểm trung bình: ");
            a.get(a.size() - 1).diemTb = nhap.nextDouble();
            System.out.println();
            nhap.nextLine();
        }
    }
    
    public void xuatDanhSach(){
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i).hoTen);
            System.out.println(a.get(i).diemTb);
            System.out.println();
        }
    }
    
    public void xuatDanhSachTheoKhoangDiem(){
        double min, max;
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập điểm nhỏ nhất trong khoảng: ");
        min = nhap.nextDouble();
        System.out.print("Nhập điểm lớn nhất trong khoảng: ");
        max = nhap.nextDouble();
        for(int i = 0; i < a.size(); i++){
            if((a.get(i).diemTb >= min) && (a.get(i).diemTb <= max)){
                System.out.println(a.get(i).hoTen);
                System.out.println(a.get(i).diemTb);
                System.out.println();
            }
        }
    }
    
    public void timSinhVien(){
        Scanner nhap = new Scanner(System.in);
        boolean found = false;
        
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String tim = nhap.nextLine();
        
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).hoTen.equalsIgnoreCase(tim)){
                System.out.println(a.get(i).hoTen);
                System.out.println(a.get(i).diemTb);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy sinh viên này.");
        }
    }
    
    public void timVaSuaSinhVien(){
        Scanner nhap = new Scanner(System.in);
        boolean found = false;
        
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String tim = nhap.nextLine();
        
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).hoTen.equalsIgnoreCase(tim)){
                System.out.println(a.get(i).hoTen);
                System.out.println(a.get(i).diemTb);
                System.out.println("Bạn muốn sửa tên của sinh viên này"
                        + " thành tên gì: ");
                a.get(i).hoTen = nhap.nextLine();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy sinh viên này.");
        }
    }
    
    public void timVaXoaSinhVien(){
        Scanner nhap = new Scanner(System.in);
        boolean found = false;
        String confirm;
        
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String tim = nhap.nextLine();
        
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).hoTen.equalsIgnoreCase(tim)){
                System.out.println(a.get(i).hoTen);
                System.out.println(a.get(i).diemTb);
                System.out.println("Bạn chắc chắn muốn xóa sinh "
                        + "viên này? (Yes/No)");
                confirm = nhap.nextLine();
                if(confirm.equalsIgnoreCase("Yes")){
                    a.remove(i);
                }
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy sinh viên này.");
        }
    }
    
    public void sapXepTheoDiem(){
        Collections.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.diemTb > o2.diemTb){
                    return 1;
                }else if(o1.diemTb < o2.diemTb){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
    }
    
    public void sapXepTheoHoTen(){
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.hoTen.compareTo(o2.hoTen);
            }
        };
        
        Collections.sort(a, comp);
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        Demo2 demo = new Demo2();
        String tieptuc = "Yes";
        int luachon;
        
        while(tieptuc.equalsIgnoreCase("Yes")){
            System.out.println(">>              Quản Lý Sinh Viên              <<");
            System.out.println("+-----------------------------------------------+");
            System.out.println("| 1. Nhập danh sách sinh viên.                  |");
            System.out.println("| 2. Nhập thêm sinh viên.                       |");
            System.out.println("| 3. Xuất danh sách sinh viên đã nhập.          |");
            System.out.println("| 4. Xuất danh sách sinh viên theo khoảng điểm. |");
            System.out.println("| 5. Tìm sinh viên theo họ tên.                 |");
            System.out.println("| 6. Tìm và sửa sinh viên theo họ tên.          |");
            System.out.println("| 7. Tìm và xóa theo họ tên.                    |");
            System.out.println("| 8. Sắp xếp theo điểm..                        |");
            System.out.println("| 9. Sắp xếp theo họ và tên.                    |");
            System.out.println("| 0. Kết thúc.                                  |");
            System.out.println("+-----------------------------------------------+");
            System.out.println(">>              Hãy chọn chức năng:            <<");
            luachon = nhap.nextInt();
            
            switch(luachon){
                case 1:
                    demo.nhapDanhSach();
                    break;
                case 2:
                    demo.nhapThemSinhVien();
                    break;
                case 3:
                    demo.xuatDanhSach();
                    break;
                case 4:
                    demo.xuatDanhSachTheoKhoangDiem();
                    break;
                case 5:
                    demo.timSinhVien();
                    break;
                case 6:
                    demo.timVaSuaSinhVien();
                    break;
                case 7:
                    demo.timVaXoaSinhVien();
                    break;
                case 8:
                    demo.sapXepTheoDiem();
                    break;
                case 9:
                    demo.sapXepTheoHoTen();
                    break;
                default:
                    System.exit(0);
            }
            
            nhap.nextLine();
            System.out.println("Bạn có muốn tiếp tục sử dụng chương"
                    + " trình không? (Yes/No)");
            tieptuc = nhap.nextLine();
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}