package java1_lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
    ArrayList<String> list = new ArrayList<>();
    
    public void nhapDanhSach(){
        Scanner nhap = new Scanner(System.in);
        
        while(true){
            System.out.print("Họ tên: ");
            String ht = nhap.nextLine();
            list.add(ht);
            
            System.out.print("Bạn có nhập tiếp không? Y/N ");
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
    }
    
    public void xuatDanhSach(){
        for(String s : list){
            System.out.println(s);
        }
    }
    
    public void xuatDanhSachNgauNhien(){
        Collections.shuffle(list);
        for(String s : list){
            System.out.println(s);
        }
    }
    
    public void sapXepGiamDanVaXuatRaDanhSach(){
        Collections.sort(list);
        Collections.reverse(list);
        for(String s : list){
            System.out.println(s);
        }
    }
    
    public void timVaXoaTheoHoTen(){
        Scanner nhap = new Scanner(System.in);
        boolean found = false;
        
        System.out.print("Nhập tên bạn cần tìm: ");
        String ten = nhap.nextLine();
        
        for(String s : list){
            if(s.equalsIgnoreCase(ten)){
                System.out.println(s);
                System.out.println("Bạn có chắc chắn muốn xóa người"
                        + " này không? Y/N");
                if(nhap.nextLine().equalsIgnoreCase("y")){
                    list.remove(s);
                }
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy người này trong"
                    + " danh sách.");
        }
    }
    
    public static void main(String[] args) {
        Bai2 obj = new Bai2();
        Scanner nhap = new Scanner(System.in);
        int luachon;
        
        while(true){
            System.out.println("+-------------------------------------------+");
            System.out.println("| 1. Nhập danh sách họ và tên.              |");
            System.out.println("| 2. Xuất danh sách.                        |");
            System.out.println("| 3. Xuất danh sách ngẫu nhiên.             |");
            System.out.println("| 4. Sắp xếp giảm dần và xuất ra danh sách. |");
            System.out.println("| 5. Tìm và xóa theo họ tên.                |");
            System.out.println("| 6. Kết thúc.                              |");
            System.out.println("+-------------------------------------------+");
            System.out.println(">>           Hãy chọn chức năng.           <<");
            
            luachon = nhap.nextInt();
            
            switch(luachon){
                case 1:
                    obj.nhapDanhSach();
                    break;
                case 2:
                    obj.xuatDanhSach();
                    break;
                case 3:
                    obj.xuatDanhSachNgauNhien();
                    break;
                case 4:
                    obj.sapXepGiamDanVaXuatRaDanhSach();
                    break;
                case 5:
                    obj.timVaXoaTheoHoTen();
                    break;
                default:
                    System.exit(0);
            }
            
            System.out.println("Bạn có muốn sử dụng chương trình"
                    + " tiếp không? Y/N");
            nhap.nextLine();
            if(nhap.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}