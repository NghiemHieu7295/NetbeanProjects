package java2_assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ConsoleInterFace {
    File file;
    ArrayList<Employee> list;
    int index;
    
    public void openFile() throws FileNotFoundException, IOException, ClassNotFoundException{
        Scanner nhap = new Scanner(System.in);
        String fPath;
        
        System.out.print("Nhập đường dẫn file: ");
        
        while(true){
            fPath = nhap.nextLine();

            if(fPath.matches("(\\w+/)*\\w+\\.\\w+") == false){
                System.out.println("Đường dẫn không hợp lệ. Mời nhập lại.");
            }
            else{
                break;
            }
        }
        
        file = new File(fPath);
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        list = (ArrayList<Employee>) ois.readObject();
        
        ois.close();
        fis.close();
        
        System.out.println(list.get(index));
    }
    
    public void displayList(){
        if(list == null){
            System.out.println("Hãy mở file dữ liệu trước.");
        }
        else{
            if(list.isEmpty()){
                System.out.println("Dữ liệu trống. Chưa có nhân viên"
                        + " nào cả.");
            }
            else{
                for(Employee emp : list){
                    System.out.println(emp);
                }
            }
        }
    }
    
    public void displayFirst(){
        if(list == null){
            System.out.println("Hãy mở file dữ liệu trước.");
        }
        else{
            if(list.isEmpty()){
                System.out.println("Dữ liệu trống. Chưa có nhân viên"
                        + " nào cả.");
            }
            else{
                index = 0;
                System.out.println(list.get(index));
            }
        }
    }
    
    public void displayPrev(){
        if(list == null){
            System.out.println("Hãy mở file dữ liệu trước.");
        }
        else{
            if(list.isEmpty()){
                System.out.println("Dữ liệu trống. Chưa có nhân viên"
                        + " nào cả.");
            }
            else{
                index = index - 1;
                if(index < 0){
                    index = 0;
                    System.out.println(list.get(index));
                    System.out.println("Đây là nhân viên đầu tiên rồi.");
                }
                else{
                    System.out.println(list.get(index));
                }
            }
        }
    }
    
    public void displayNext(){
        if(list == null){
            System.out.println("Hãy mở file dữ liệu trước.");
        }
        else{
            if(list.isEmpty()){
                System.out.println("Dữ liệu trống. Chưa có nhân viên"
                        + " nào cả.");
            }
            else{
                index = index + 1;
                if(index == list.size()){
                    index = list.size() - 1;
                    System.out.println(list.get(index));
                    System.out.println("Đây là nhân viên cuối cùng rồi.");
                }
                else{
                    System.out.println(list.get(index));
                }
            }
        }
    }
    
    public void displayLast(){
        if(list == null){
            System.out.println("Hãy mở file dữ liệu trước.");
        }
        else{
            if(list.isEmpty()){
                System.out.println("Dữ liệu trống. Chưa có nhân viên"
                        + " nào cả.");
            }
            else{
                index = list.size() - 1;
                System.out.println(list.get(index));
            }
        }
    }
    
    public void inputNew(){
        if(list == null){
            System.out.println("Hãy mở file dữ liệu trước.");
        }
        else{
            Scanner nhap = new Scanner(System.in);
        
            String empID;
            while(true){
                System.out.print("Mã nhân viên: ");
                empID = nhap.nextLine();
                if(empID.matches("\\w+")){
                    break;
                }
                else{
                    System.out.println("Mã nhân viên chỉ chứa chữ cái"
                            + " và số. Xin hãy nhập lại.");
                }
            }

            String empName;
            while(true){
                System.out.print("Họ tên: ");
                empName = nhap.nextLine();
                if(empName.matches("[a-zA-Z]+ [a-zA-Z]+ [a-zA-Z]+")){
                    break;
                }
                else{
                    System.out.println("Họ tên chỉ chứa chữ cái và 1 ký"
                            + " tự trắng giữa tên đệm với họ và tên.");
                }
            }
            
            String empAge;
            while(true){
                System.out.print("Tuổi: ");
                empAge = nhap.nextLine();
                if(empAge.matches("\\d+")){
                    break;
                }
                else{
                    System.out.println("Tuổi phải là chữ số. Mời nhập lại.");
                }
            }

            String empAddr;
            while(true){
                System.out.print("Địa chỉ: ");
                empAddr = nhap.nextLine();
                if(empAddr.matches("[\\w ,]+")){
                    break;
                }
                else{
                    System.out.println("Địa chỉ chứa chữ cái, số, ký tự trắng"
                            + " và dấu \",\". Mời nhập lại.");
                }
            }

            String empEmail;
            while(true){
                System.out.print("Email: ");
                empEmail = nhap.nextLine();
                if(empEmail.matches("\\w+@\\w+\\.\\w+")){
                    break;
                }
                else{
                    System.out.println("Email phải chứa 1 ký tự \"@\" và"
                            + " 1 ký tự \".\". Mời nhập lại.");
                }
            }

            String empSal;
            while(true){
                System.out.print("Lương: ");
                empSal = nhap.nextLine();
                if(empSal.matches("\\d+")){
                    break;
                }
                else{
                    System.out.println("Lương phải là chữ số. Mời nhập"
                            + " lại.");
                }
            }

            String empPos;
            while(true){
                System.out.print("Chức vụ: ");
                empPos = nhap.nextLine();
                if(empPos.matches("[a-zA-Z ]+")){
                    break;
                }
                else{
                    System.out.println("Chức vụ chỉ chứa chữ cái và ký"
                            + " tự trắng. Mời nhập lại.");
                }
            }
            
            if(list.isEmpty()){
                Employee emp = new Employee();
                emp.setEmpID(empID);
                emp.setEmpName(empName);
                emp.setAge(Integer.parseInt(empAge));
                emp.setEmpAddress(empAddr);
                emp.setEmpEmail(empEmail);
                emp.setEmpSalary(Double.parseDouble(empSal));
                emp.setEmpPosition(empPos);

                list.add(emp);
                
                System.out.println("Đã thêm nhân viên mới.");
            }
            else{
                boolean found = false;
                do{
                    for(Employee emp : list){
                        if(empID.equalsIgnoreCase(emp.getEmpID())){
                            System.out.println("Mã nhân viên này đã tồn"
                                    + " tại. Xin hãy nhập mã khác.");
                            found = true;
                            break;
                        }
                        else{
                            found = false;
                        }
                    }
                    while(found){
                        System.out.print("Mã nhân viên: ");
                        empID = nhap.nextLine();
                        if(empID.matches("\\w+")){
                            break;
                        }
                        else{
                            System.out.println("Mã nhân viên chỉ chứa chữ cái"
                            + " và số. Xin hãy nhập lại.");
                        }
                    }
                }while(found);
                
                Employee emp = new Employee();
                emp.setEmpID(empID);
                emp.setEmpName(empName);
                emp.setAge(Integer.parseInt(empAge));
                emp.setEmpAddress(empAddr);
                emp.setEmpEmail(empEmail);
                emp.setEmpSalary(Double.parseDouble(empSal));
                emp.setEmpPosition(empPos);

                list.add(emp);
                System.out.println("Đã thêm nhân viên mới.");
                
                Collections.sort(list, new Comparator<Employee>(){
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getEmpID().compareTo(o2.getEmpID());
                    }
                });
            }
        }       
    }
    
    public void deleteEmployee(){
        if(list == null){
            System.out.println("Hãy mở file dữ liệu trước.");
        }
        else{
            if(list.isEmpty()){
                System.out.println("Bạn đã xóa hết nhân viên.");
            }
            else{
                Scanner nhap = new Scanner(System.in);
                String answer;

                System.out.println(list.get(index));
                System.out.print("Bạn chắc chắn muốn xóa nhân viên này? (Y/N) ");
                while(true){
                    answer = nhap.nextLine();
                    if(answer.matches("[yYnN]")){
                        break;
                    }
                    else{
                        System.out.println("Xin hãy nhập y hoặc n.");
                    }
                }

                if(answer.equalsIgnoreCase("Y")){
                    list.remove(index);
                    System.out.println("Xóa nhân viên thành công.");
                    index = list.size() - 1;
                }
            }
        }
    }
    
    public void findEmployee(){
        if(list == null){
            System.out.println("Hãy mở file dữ liệu trước.");
        }
        else{
            Scanner nhap = new Scanner(System.in);
            String empID;
            boolean found = false;
            
            while(true){
                System.out.print("Nhập mã nhân viên cần tìm: ");
                empID = nhap.nextLine();
                
                if(empID.matches("\\w+")){
                    break;
                }
                else{
                    System.out.println("Mã nhân viên không hợp lệ."
                            + " Mời nhập lai.");
                }
            }
            
            for(Employee emp : list){
                if(emp.getEmpID().equalsIgnoreCase(empID)){
                    System.out.println(emp);
                    index = list.indexOf(emp);
                    found = true;
                    break;
                }
            }
            
            if(!found){
                System.out.println("Không tìm thấy nhân viên này.");
            }
        }
    }
    
    public void saveAndExit() throws FileNotFoundException, IOException{
        if(list == null){
            System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
            System.exit(0);
        }
        else{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(list);
            System.out.println("Đã lưu.");
            
            oos.close();
            fos.close();
            
            System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        ConsoleInterFace app = new ConsoleInterFace();
        Scanner nhap = new Scanner(System.in);
        int luachon = 0;
        boolean valid;
        String tieptuc = "";
        
        do{
            System.out.println(">>      EMPLOYEE MANAGEMENT     <<");
            System.out.println("+--------------------------------+");
            System.out.println("| 1. Open File Data.             |");
            System.out.println("| 2. Display List Of Employee.   |");
            System.out.println("| 3. Display First Employee.     |");
            System.out.println("| 4. Display Previous Employee.  |");
            System.out.println("| 5. Display Next Employee.      |");
            System.out.println("| 6. Display Last Employee.      |");
            System.out.println("| 7. Input New Employee.         |");
            System.out.println("| 8. Delete An Employee.         |");
            System.out.println("| 9. Find An Employee.           |");
            System.out.println("| 10. Save And Exit.             |");
            System.out.println("+--------------------------------+");
            System.out.println(">>  Hãy chọn chức năng (1- 10)  <<");
            
            do{
                try{
                    luachon = nhap.nextInt();
                    valid = true;
                }
                catch(Exception e){
                    nhap.next();
                    System.out.println(e);
                    System.out.println("Xin hãy chọn lại. Phải là"
                            + " số từ 1 - 10.");
                    valid = false;
                }
            }
            while(!valid);
            
            switch(luachon){
                case 1:
                    try{
                        app.openFile();
                    }
                    catch(FileNotFoundException e){
                        System.out.println("File này không tồn tại.");
                    }
                    catch(IOException | ClassNotFoundException e){
                        System.out.println("Dữ liệu trống.");
                    }
                    break;
                case 2:
                    app.displayList();
                    break;
                case 3:
                    app.displayFirst();
                    break;
                case 4:
                    app.displayPrev();
                    break;
                case 5:
                    app.displayNext();
                    break;
                case 6:
                    app.displayLast();
                    break;
                case 7:
                    app.inputNew();
                    break;
                case 8:
                    app.deleteEmployee();
                    break;
                case 9:
                    app.findEmployee();
                    break;
                case 10:
                    try{
                        app.saveAndExit();
                    }
                    catch(FileNotFoundException e){
                        System.out.println("Không xác định được file để lưu.");
                    }
                    catch(IOException e){
                        System.out.println("Có lỗi gì đó.");
                    }
                    break;
                default:
                    break;
            }
            
            nhap.nextLine();
            System.out.print("Bạn có dùng chương trình"
                    + " nữa không? (Y/N) ");
            while(true){
                tieptuc = nhap.nextLine();
                if(tieptuc.matches("[yYnN]") == false){
                    System.out.println("Xin hãy nhập y hoặc n. Mời"
                            + " nhập lại.");
                }
                else{
                    break;
                }
            }
        }
        while(tieptuc.equalsIgnoreCase("Y"));
        
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}