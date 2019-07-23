package java1_lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo2 {
    ArrayList<String> list = new ArrayList<>();
    
    public void nhapDanhSachSinhVien(){
        Scanner nhap = new Scanner(System.in);
        while(true){
            System.out.print("Họ tên: ");
            String s = nhap.nextLine();
            list.add(s);
            
            System.out.print("Bạn có nhập tiếp không? Y/N ");
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
    }
    
    public void xuatDanhSachSinhVien(){
        for(String s : list){
            System.out.println(s);
        }
    }
    
    public void xuatSinhVienCoHoHoacTenNhapTuBanPhim(){
        Scanner nhap = new Scanner(System.in);
        String ho, ten;
        int luachon;
        boolean found = false;
        
        System.out.println("Bạn tìm sinh viên theo họ hay theo tên hay"
                + " theo cả họ và tên?");
        System.out.println("1. Tìm theo họ.");
        System.out.println("2. Tìm theo tên.");
        System.out.println("3. Tìm theo cả họ và tên.");
        
        luachon = nhap.nextInt();
        
        switch(luachon){
            case 1:
                nhap.nextLine();
                System.out.print("Nhập họ: ");
                ho = nhap.nextLine();
                
                for(String s : list){
                    String timHo = s.substring(0, s.indexOf(" "));
                    if(timHo.equalsIgnoreCase(ho)){
                        System.out.println(s);
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Không tìm thấy sinh viên nào"
                            + " có họ như thế này.");
                }
                break;
            case 2:
                nhap.nextLine();
                System.out.print("Nhập tên: ");
                ten = nhap.nextLine();
                
                for(String s : list){
                    String timTen = s.substring(s.lastIndexOf(" ") + 1);
                    if(timTen.equalsIgnoreCase(ten)){
                        System.out.println(s);
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Không tìm thấy sinh viên nào"
                            + " có tên như thế này.");
                }
                break;
            case 3:
                nhap.nextLine();
                System.out.print("Nhập họ: ");
                ho = nhap.nextLine();
                System.out.print("Nhập tên: ");
                ten = nhap.nextLine();
                
                for(String s : list){
                    String timHo = s.substring(0, s.indexOf(" "));
                    String timTen = s.substring(s.lastIndexOf(" ") + 1);
                    
                    if(timHo.equalsIgnoreCase(ho) && timTen.equalsIgnoreCase(ten)){
                        System.out.println(s);
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Không tìm thấy sinh viên nào"
                            + " có họ và tên như thế này.");
                }
                break;
            default:
                System.exit(0);
        }
    }
    
    public void xuatSinhVienCoTenDemNhapTuBanPhim(){
        Scanner nhap = new Scanner(System.in);
        String dem;
        boolean found = false;
        
        System.out.print("Nhập tên đệm: ");
        dem = nhap.nextLine();
        
        for(String s : list){
            String timDem = s.substring(s.indexOf(" "), s.lastIndexOf(" ") + 1).trim();
            if(timDem.equalsIgnoreCase(dem)){
                System.out.println(s);
                found = true;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy sinh viên nào"
                    + " có tên đệm như thế này.");
        }
    }
    
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        Scanner nhap = new Scanner(System.in);
        int luachon;
        
        while(true){
            System.out.println(">>                         Quản lý sinh "
                    + "viên.                        <<");
            System.out.println("+---------------------------------------"
                    + "------------------------------+");
            System.out.println("| 1. Nhập mảng họ tên sinh viên.                                      |");
            System.out.println("| 2. Xuất mảng họ tên sinh viên.                                      |");
            System.out.println("| 3. Xuất họ tên của những sinh viên có "
                    + "họ hoặc tên nhập từ bàn phím. |");
            System.out.println("| 4. Xuất họ tên của những sinh viên có "
                    + "tên đệm nhập từ bàn phím.     |");
            System.out.println("+---------------------------------------"
                    + "------------------------------+");
            System.out.println(">>                        Hãy chọn chức "
                    + "năng.                        <<");
            
            luachon = nhap.nextInt();
            
            switch(luachon){
                case 1:
                    obj.nhapDanhSachSinhVien();
                    break;
                case 2:
                    obj.xuatDanhSachSinhVien();
                    break;
                case 3:
                    obj.xuatSinhVienCoHoHoacTenNhapTuBanPhim();
                    break;
                case 4:
                    obj.xuatSinhVienCoTenDemNhapTuBanPhim();
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