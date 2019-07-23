package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment1 {
    ArrayList<Employee> list = new ArrayList<>();
    
    public void nhapDanhSachNhanVien(){
        Scanner nhap = new Scanner(System.in);
        
        while(true){
            String employeeCode;
            while(true){
                System.out.print("Mã nhân viên: ");
                String test = nhap.nextLine();
                
                if(test.matches("[^\\s]+")){
                    employeeCode = test;
                    break;
                }
                else{
                    System.out.println("Mã nhân viên không được"
                            + " chứa ký tự trắng.\nXin mời nhập lại.");
                }
            }
            
            String employeeName;
            while(true){
                System.out.print("Họ tên: ");
                String test = nhap.nextLine();
                
                if(test.matches("[a-zA-z ]+")){
                    employeeName = test;
                    break;
                }
                else{
                    System.out.println("Họ tên chỉ có thể là các chữ"
                            + " cái và ký tự trắng.\nXin mời nhập lại.");
                }
            }
            
            double employeeSalary;
            while(true){
                System.out.print("Lương: ");
                String test = nhap.nextLine();
                
                if(test.matches("[0-9]+")){
                    employeeSalary = Double.parseDouble(test);
                    break;
                }
                else{
                    System.out.println("Lương phải là chữ số.\nXin mời"
                            + " nhập lại");
                }
            }
            
            String position;
            
            while(true){
                System.out.print("Chức vụ (Marketing / Truong Phong): ");
                String test = nhap.nextLine();
                
                if((test.equalsIgnoreCase("Marketing")) || 
                   (test.equalsIgnoreCase("Truong Phong")) || 
                   (test.equalsIgnoreCase("TruongPhong"))){
                    position = test;
                    break;
                }
                else{
                    System.out.println("Chức vụ phải là trưởng phòng"
                            + " hoặc marketing.");
                }
            }
            
            if(position.equalsIgnoreCase("Marketing")){
                Marketing mk = new Marketing();
                mk.setEmpCode(employeeCode);
                mk.setEmpName(employeeName);
                mk.setSalary(employeeSalary);
                
                double sales;
                while(true){
                    System.out.print("Doanh số: ");
                    String test = nhap.nextLine();
                    
                    if(test.matches("[0-9]+")){
                        sales = Double.parseDouble(test);
                        break;
                    }
                    else{
                        System.out.println("Doanh số phải là số.\nXin"
                                + " mời nhập lại.");
                    }
                }
                
                double commission;
                while(true){
                    System.out.print("Hoa hồng: ");
                    String test = nhap.nextLine();
                    
                    if(test.matches("[0-9]+")){
                        commission = Double.parseDouble(test);
                        break;
                    }
                    else{
                        System.out.println("Hoa hồng phải là số.\n"
                                + "Xin mời nhập lại.");
                    }
                }
                
                mk.setSales(sales);
                mk.setCommission(commission);
                
                list.add(mk);
            }
            else{
                GeneralinChief gen = new GeneralinChief();
                gen.setEmpCode(employeeCode);
                gen.setEmpName(employeeName);
                gen.setSalary(employeeSalary);
                
                double trachNhiem;
                while(true){
                    System.out.print("Lương trách nhiệm: ");
                    String test = nhap.nextLine();
                    
                    if(test.matches("[0-9]+")){
                        trachNhiem = Double.parseDouble(test);
                        break;
                    }
                    else{
                        System.out.println("Xin hãy nhập số.");
                    }
                }
                
                gen.setTrachNhiem(trachNhiem);
                
                list.add(gen);
            }

            System.out.print("Bạn có nhập tiếp không? Y/N ");
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
            else{
                System.out.println();
                System.out.println("Mời bạn nhập tiếp.");
            }
        }
    }
    
    public void xuatDanhSachNhanVien(){
        for(Employee emp : list){
            emp.xuat();
            System.out.println();
        }
    }
    
    public void timVaHienThiTheoMa(){
        Scanner nhap = new Scanner(System.in);
        boolean found = false;
        
        System.out.print("Nhập mã của nhân viên cần tìm: ");
        String employeeCode = nhap.nextLine();
        
        for(Employee emp : list){
            if(emp.getEmpCode().equalsIgnoreCase(employeeCode)){
                emp.xuat();
                found = true;
                break;
            }
        }
        
        if(!found){
            System.out.println("Không tìm thấy nhân viên này.");
        }
    }
    
    public void xoaNhanVienTheoMa(){
        Scanner nhap = new Scanner(System.in);
        boolean found = false;
        
        System.out.print("Nhập mã của nhân viên cần xóa: ");
        String employeeCode = nhap.nextLine();
        
        for(Employee emp : list){
            if(emp.getEmpCode().equalsIgnoreCase(employeeCode)){
                list.remove(emp);
                found = true;
                break;
            }
        }
        
        if(!found){
            System.out.print("Không tìm thấy nhân viên này.");
        }
    }
    
    public void capNhatThongTinTheoMa(){
        Scanner nhap = new Scanner(System.in);
        boolean found = false;
        
        System.out.print("Nhập mã của nhân viên cần tìm: ");
        String employeeCode = nhap.nextLine();
        
        for(Employee emp : list){
            if(emp.getEmpCode().equalsIgnoreCase(employeeCode)){
                
            }
        }
    }
    
    public void timNhanVienTheoKhoangLuong(){
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập lương thấp nhất: ");
        double minSalary = nhap.nextDouble();
        System.out.print("Nhập lương cao nhất: ");
        double maxSalary = nhap.nextDouble();
        System.out.println();
        
        for(Employee emp : list){
            if((emp.getSalary() >= minSalary) && (emp.getSalary() <= maxSalary)){
                emp.xuat();
                System.out.println();
            }
        }
    }
    
    public void sapXepTheoHoTen(){
        Scanner nhap = new Scanner(System.in);
        int luachon;
        
        System.out.println("Bạn muốn sắp xếp như thế nào?");
        System.out.println("1. Từ A-Z.");
        System.out.println("2. Từ Z-A.");
        luachon = nhap.nextInt();
        
        switch(luachon){
            case 1:
                Collections.sort(list, (Employee o1, Employee o2) -> 
                        o1.getEmpName().compareTo(o2.getEmpName()));
                break;
            case 2:
                Collections.sort(list, (Employee o1, Employee o2) -> 
                        o1.getEmpName().compareTo(o2.getEmpName()));
                Collections.reverse(list);
                break;
        }
    }
    
    public void sapXepTheoThuNhap(){
        Scanner nhap = new Scanner(System.in);
        int luachon;
        
        System.out.println("Bạn muốn sắp xếp như thế nào?");
        System.out.println("1. Thu nhập tăng dần.");
        System.out.println("2. Thu nhập giảm dần.");
        luachon = nhap.nextInt();
        
        switch(luachon){
            case 1:
                Collections.sort(list, (Employee o1, Employee o2) -> {
                    if(o1.getInCome() > o2.getInCome()){
                        return 1;
                    }else if(o1.getInCome() < o2.getInCome()){
                        return -1;
                    }else{
                        return 0;
                    }
                });
                break;
            case 2:
                Collections.sort(list, (Employee o1, Employee o2) -> {
                    if(o1.getInCome() > o2.getInCome()){
                        return -1;
                    }else if(o1.getInCome() < o2.getInCome()){
                        return 1;
                    }else{
                        return 0;
                    }
                });
                break;
        }
    }
    
    public void xuat5NhanVienCoThuNhapCaoNhat(){
        Collections.sort(list, (Employee o1, Employee o2) -> {
            if(o1.getInCome() > o2.getInCome()){
                return -1;
            }else if(o1.getInCome() < o2.getInCome()){
                return 1;
            }else{
                return 0;
            }
        });
        
        try{
            for(int i = 0; i < 5; i++){
                list.get(i).xuat();
                System.out.println();
            }
        }
        catch(Exception e){
            System.out.println();
            System.out.println("Danh sách không có đủ 5 nhân viên.");
        }
    }
    
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        Assignment1 obj = new Assignment1();
        int luachon;
        
        while(true){
            System.out.println(">>       Quản lý nhân sự tiền lương.       <<");
            System.out.println("+-------------------------------------------+");
            System.out.println("| 1. Nhập danh sách nhân viên.              |");
            System.out.println("| 2. Xuất danh sách nhân viên.              |");
            System.out.println("| 3. Tìm và hiển thị nhân viên theo mã.     |");
            System.out.println("| 4. Xóa nhân viên theo mã.                 |");
            System.out.println("| 5. Cập nhật thông tin nhân viên theo mã.  |");
            System.out.println("| 6. Tìm các nhân viên theo khoảng lương.   |");
            System.out.println("| 7. Sắp xếp nhân viên theo họ và tên.      |");
            System.out.println("| 8. Sắp xếp nhân viên theo thu nhập.       |");
            System.out.println("| 9. Xuất 5 nhân viên có thu nhập cao nhất. |");
            System.out.println("+-------------------------------------------+");
            System.out.println(">>        Hãy chọn chức năng. (1-9)        <<");

            luachon = nhap.nextInt();
            switch(luachon){
                case 1:
                    obj.nhapDanhSachNhanVien();
                    break;
                case 2:
                    obj.xuatDanhSachNhanVien();
                    break;
                case 3:
                    obj.timVaHienThiTheoMa();
                    break;
                case 4:
                    obj.xoaNhanVienTheoMa();
                    break;
                case 5:
                    obj.capNhatThongTinTheoMa();
                    break;
                case 6:
                    obj.timNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    obj.sapXepTheoHoTen();
                    break;
                case 8:
                    obj.sapXepTheoThuNhap();
                    break;
                case 9:
                    obj.xuat5NhanVienCoThuNhapCaoNhat();
                    break;
                default:
                    System.exit(0);
            }

            System.out.println();
            nhap.nextLine();
            System.out.print("Bạn có sử dụng chương trình tiếp không? Y/N ");
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
            else{
                System.out.println();
            }
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}