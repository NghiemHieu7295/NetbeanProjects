package java2_assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static File file;
    static ArrayList<Employee> list = new ArrayList<>();
    
    public void ghiObject() throws FileNotFoundException, IOException, ClassNotFoundException{
        Scanner scan = new Scanner(System.in);
        String eID, eName, eAddr, eMail, ePos;
        int eAge;
        double eSal;
        
        do{
            System.out.print("Mã nhân viên: ");
            String id = scan.nextLine();
            
            if(id.matches("\\w+")){
                eID = id;
                break;
            }
            else{
                System.out.println("Xin hãy nhập lại.\nMã nhân viên"
                        + " chỉ chứa các chữ cái và số.");
            }
        }while(true);
        
        do{
            System.out.print("Họ tên: ");
            String name = scan.nextLine();
            
            if(name.matches("[a-zA-Z]+ [a-zA-Z]+ [a-zA-Z]+")){
                eName = name;
                break;
            }
            else{
                System.out.println("Xin hãy nhập lại.\nHọ tên chỉ"
                        + " chứa các chữ cái và ký tự trắng chỉ"
                        + " xuất hiện 1 lần giữa tên đệm với họ và tên.");
            }
        }while(true);
        
        do{
            System.out.print("Tuổi: ");
            String age = scan.nextLine();
            
            if(age.matches("[0-9]+")){
                eAge = Integer.parseInt(age);
                break;
            }
            else{
                System.out.println("Xin hãy nhập lại.\nTuổi phải là"
                        + " chữ số.");
            }
        }while(true);
        
        do{
            System.out.print("Địa chỉ: ");
            String addr = scan.nextLine();
            
            if(addr.matches("[\\w, ]+")){
                eAddr = addr;
                break;
            }
            else{
                System.out.println("Xin hãy nhập lại.\nĐịa chỉ không"
                        + " được để trống.");
            }
        }while(true);
        
        do{
            System.out.print("Email: ");
            String mail = scan.nextLine();
            
            if(mail.matches("\\w+@\\w+\\.\\w+")){
                eMail = mail;
                break;
            }
            else{
                System.out.println("Xin hãy nhập lại.\nEmail phải chứa"
                        + " 1 ký tự @ và 1 ký tự \".\"");
            }
        }while(true);
        
        do{
            System.out.print("Lương: ");
            String sal = scan.nextLine();
            
            if(sal.matches("[0-9]+")){
                eSal = Double.parseDouble(sal);
                break;
            }
            else{
                System.out.println("Xin hãy nhập lại.\nLương phải là"
                        + " chữ số.");
            }
        }while(true);
        
        do{
            System.out.print("Chức vụ: ");
            String pos = scan.nextLine();
            
            if(pos.matches("[a-zA-Z ]+")){
                ePos = pos;
                break;
            }
            else{
                System.out.println("Xin hãy nhập lại.\nChức vụ chỉ"
                        + " chứa các chữ cái và ký tự trắng.");
            }
        }while(true);
        
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        list = (ArrayList<Employee>) ois.readObject();
        
        if(list.isEmpty()){
            System.out.println("File dữ liệu trống.");
        }
        else{
            System.out.println("Đã đọc hết file vào mảng.");
            ois.close();
            fis.close();
        }
        
        Employee em = new Employee();
        em.setEmpID(eID);
        em.setEmpName(eName);
        em.setAge(eAge);
        em.setEmpAddress(eAddr);
        em.setEmpEmail(eMail);
        em.setEmpSalary(eSal);
        em.setEmpPosition(ePos);
        
        list.add(em);
        
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(list);
        System.out.println("Đã ghi thành công!");
        list.clear();
        oos.close();
        fos.close();
    }
    
    public void docObject() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        list = (ArrayList<Employee>) ois.readObject();
        
        if(list.isEmpty()){
            System.out.println("File dữ liệu trống.");
        }
        else{
            for(Employee em : list){
                System.out.println(em);
            }
            System.out.println("Đã đọc xong.");
        }
        
        ois.close();
        fis.close();
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        file = new File("test/dulieu.txt");
        if(file.exists()){}
        else{
            file.createNewFile();
            System.out.println("Đã tạo file dữ liệu.");
        }
        
        Test t = new Test();
        Scanner scan = new Scanner(System.in);
        int luachon;
        
        while(true){
            System.out.println(">>      Test Object.     <<");
            System.out.println("+-------------------------+");
            System.out.println("| 1. Ghi Object vào File. |");
            System.out.println("| 2. Đọc Object từ File.  |");
            System.out.println("+-------------------------+");
            System.out.println(">>  Hãy chọn chức năng.  <<");
            luachon = scan.nextInt();
            
            switch(luachon){
                case 1:
                    t.ghiObject();
                    break;
                case 2:
                    t.docObject();
                    break;
            }
            
            scan.nextLine();
            System.out.print("Bạn có dùng chương trình tiếp không? Y/N ");
            if(scan.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}