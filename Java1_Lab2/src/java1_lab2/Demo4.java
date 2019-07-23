package java1_lab2;

import java.util.Scanner;

public class Demo4 {
    
    public void phepCong(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhập số a: ");
        int a = scan.nextInt();
        System.out.print("Nhập số b: ");
        int b = scan.nextInt();
        
        int c = a + b;
        
        System.out.println("Tổng 2 số vừa nhập là: " + c);
    }
    
    public void phepTru(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhập số a: ");
        int a = scan.nextInt();
        System.out.print("Nhập số b: ");
        int b = scan.nextInt();
        
        int c = a - b;
        
        System.out.println("Hiệu 2 số vừa nhập là: " + c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Demo4 obj = new Demo4();
        int luachon;
        String tieptuc;
        
        while(true){
            System.out.println(">>Máy Tính Cá Nhân<<");
            System.out.println("+------------------+");
            System.out.println("| 1. Cộng.         |");
            System.out.println("| 2. Trừ.          |");
            System.out.println("| 3. Kết thúc.     |");
            System.out.println("+------------------+");
            System.out.println(">> Chọn Chức Năng <<");
            luachon = scan.nextInt();
            
            switch(luachon){
                case 1:
                    obj.phepCong();
                    break;
                case 2:
                    obj.phepTru();
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
            
            scan.nextLine();
            System.out.print("Bạn có dùng chương trình tiếp không? (Y/N) ");
            tieptuc = scan.nextLine();
            if(tieptuc.equalsIgnoreCase("N")){
                break;
            }
        }
        
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}