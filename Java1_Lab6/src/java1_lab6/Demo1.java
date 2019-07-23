package java1_lab6;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String username;
        String password;
        
        while(true){
            System.out.print("Username: ");
            username = nhap.nextLine();
            System.out.print("Password: ");
            password = nhap.nextLine();

            if(username.equalsIgnoreCase("hello") && password.length() > 6){
                System.out.println("Đăng nhập thành công.");
                break;
            }
            else{
                System.out.println("Xin mời nhập lại. User name là hello,"
                        + " mật khẩu phải lớn \nhơn 6 ký tự.");
            }
        }
    }   
}