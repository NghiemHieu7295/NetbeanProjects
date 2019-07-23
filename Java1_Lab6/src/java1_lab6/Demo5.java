package java1_lab6;

import java.util.Scanner;

public class Demo5 {

    public void nhapSoDienThoai(){
        Scanner nhap = new Scanner(System.in);
        
        String pattern = "0[0-9]{9,10}";
        
        while(true){
            System.out.print("Số mobile: ");
            String mobile = nhap.nextLine();
    
            if(mobile.matches(pattern)){
                System.out.println("Bạn đã nhập đúng số mobile");
                System.out.println("Bạn có nhập tiếp không? Y/N");
                if(nhap.nextLine().equalsIgnoreCase("N")){
                    break;
                }
                else{
                    System.out.println("Mời bạn nhập tiếp.");
                }
            }
            else{
                System.out.println("Bạn chưa nhập đúng số mobile."
                        + " Xin mời nhập lại.");
            }
        }
    }
    
    public void nhapBienSoXe(){
        Scanner nhap = new Scanner(System.in);

        String pattern = "[0-6][0-9]-[A-Z]\\d-\\d{3}-\\d{2}";
        
        while(true){
            System.out.print("Biển số xe: ");
            String soxe = nhap.nextLine();

            if(soxe.matches(pattern)){
                System.out.println("Bạn đã nhập đúng biển số xe.");
                System.out.print("Bạn có nhập tiếp không? Y/N ");
                if(nhap.nextLine().equalsIgnoreCase("N")){
                    break;
                }
                else{
                    System.out.println("Mời bạn nhập tiếp.");
                }
            }
            else{
                System.out.println("Biển số xe không hợp lệ."
                        + " Mời bạn nhập lại.");
            }
        }
    }
    
    public void nhapSoChungMinhThu(){
        Scanner nhap = new Scanner(System.in);
        
        while(true){
            System.out.print("Số chứng minh thư: ");
            String cmt = nhap.nextLine();

            if(cmt.matches("\\d{9}")){
                System.out.println("Chứng minh thư hợp lệ.");
                System.out.print("Bạn có nhập tiếp không? Y/N ");
                if(nhap.nextLine().equalsIgnoreCase("N")){
                    break;
                }
                else{
                    System.out.println("Mời bạn nhập tiếp.");
                }
            }
            else{
                System.out.println("Số chứng minh thư không hợp"
                        + " lệ. Xin mời nhập lại.");
            }
        }
    }
    
    public void nhapEmail(){
        Scanner nhap = new Scanner(System.in);
        
        String pattern = "\\w+@\\w+\\.\\w+";
        
        while(true){
            System.out.print("Email: ");
            String email = nhap.nextLine();
            
            if(email.matches(pattern)){
                System.out.println("Email hợp lệ.");
                System.out.print("Bạn có nhập tiếp không? Y/N ");
                if(nhap.nextLine().equalsIgnoreCase("N")){
                    break;
                }
                else{
                    System.out.println("Mời bạn nhập tiếp.");
                }
            }
            else{
                System.out.println("Email không hợp"
                        + " lệ. Xin mời nhập lại.");
            }
        }
    }
    
    public static void main(String[] args) {
        Demo5 obj = new Demo5();
        obj.nhapEmail();
    }   
}