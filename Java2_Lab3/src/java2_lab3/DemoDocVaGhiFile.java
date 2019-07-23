package java2_lab3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoDocVaGhiFile {

    public void TaoMoi() throws IOException{
        Scanner nhap = new Scanner(System.in);
        int luachon = 0;
        boolean valid;
        
        System.out.println("Bạn muốn tạo file hay folder? ");
        System.out.println("1. File.");
        System.out.println("2. Folder.");
        
        do{
            try{
                luachon = nhap.nextInt();
                valid = true;
            }
            catch(Exception e){
                System.out.println("Xin hãy nhập số.");
                valid = false;
                nhap.next();
            }
        }while(!valid);
        
        switch(luachon){
            case 1:
                nhap.nextLine();
                System.out.print("Nhập tên file cần tạo: ");
                String fileName = nhap.nextLine();
                
                File file = new File(fileName);
                if(file.exists()){
                    System.out.println("File này đã tồn tại.");
                }
                else{
                    file.createNewFile();
                    System.out.println("Đã tạo xong!");
                }
                break;
            case 2:
                nhap.nextLine();
                System.out.print("Nhập tên folder cần tạo: ");
                String folderName = nhap.nextLine();
                
                File dir = new File(folderName);
                if(dir.exists()){
                    System.out.println("Thư mục này đã tồn tại.");
                }
                else{
                    dir.mkdir();
                    System.out.println("Đã tạo xong!");
                }
                break;
            default:
                System.exit(0);
        }
    }
    
    public void GhiFile() throws FileNotFoundException, IOException{
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập tên file cần ghi: ");
        String fileName = nhap.nextLine();
        
        File file = new File(fileName);
        
        FileOutputStream fos = new FileOutputStream(file);
        
        System.out.print("Nhập nội dung ghi vào: ");
        String content = nhap.nextLine();
        
        fos.write(content.getBytes());
        //fos.close();
        System.out.println("Đã ghi xong.");
    }
    
    public void DocFile() throws FileNotFoundException, IOException{
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhập tên file cần đọc: ");
        String fileName = nhap.nextLine();
        
        File file = new File(fileName);
        
        FileInputStream fis = new FileInputStream(file);
        int c = fis.read();
        if(c == -1){
            System.out.println("File này trống. Chưa có nội dung gì.");
        }
        else{
            while(c != -1){
                System.out.print((char) c);
                c = fis.read();
            }
        }
        //fis.close();
        System.out.println();
        System.out.println("Đã đọc xong.");
    }
    
    public static void main(String[] args) {
        DemoDocVaGhiFile obj = new DemoDocVaGhiFile();
        Scanner nhap = new Scanner(System.in);
        int luachon;
        
        while(true){
            System.out.println(">>   Quản lý File.   <<");
            System.out.println("+---------------------+");
            System.out.println("| 1. Tạo mới.         |");
            System.out.println("| 2. Ghi File.        |");
            System.out.println("| 3. Đọc File.        |");
            System.out.println("+---------------------+");
            System.out.println(">>Hãy chọn chức năng.<<");
            luachon = nhap.nextInt();

            switch(luachon){
                case 1:
                    try{
                        obj.TaoMoi();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                    break;

                case 2:
                    try{
                        obj.GhiFile();
                    }
                    catch(FileNotFoundException e){
                        System.out.println("Không tìm thấy file này.");
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    try{
                        obj.DocFile();
                    }
                    catch(FileNotFoundException e){
                        System.out.println("Không tìm thấy file này.");
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                    break;
                default:
                    System.exit(0);
            }
            
            nhap.nextLine();
            System.out.println();
            System.out.print("Bạn có sử dụng chương trình nữa không? Y/N ");
            if(nhap.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}