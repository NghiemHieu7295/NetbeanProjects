package java1_lab6;

import java.util.Scanner;

public class Demo6 {
    
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        String masvPattern = "[A-Z]{5}";
        String passPattern = ".{6,}";
        String hotenPattern = "[a-zA-Z ]+";
        String emailPattern = "\\w+@\\w+(\\.\\w+){1,2}";
        String phonePattern = "0[0-9]{9}";
        String bikePattern = "[0-6]\\d-[A-Z]\\d-\\d{3}-\\d{2}";
        String cmndPattern = "\\d{9}";
        String webPattern = "http://www\\.\\w+\\.\\w+";
        String mess = "";
        
        while(true){
            System.out.print("Mã sinh viên: ");
            String masv = nhap.nextLine();
            System.out.print("Mật khẩu: ");
            String pass = nhap.nextLine();
            System.out.print("Họ tên: ");
            String hoten = nhap.nextLine();
            System.out.print("Email: ");
            String email = nhap.nextLine();
            System.out.print("Số điện thoại: ");
            String phone = nhap.nextLine();
            System.out.print("Biển số xe: ");
            String bike = nhap.nextLine();
            System.out.print("Số chứng minh nhân dân: ");
            String cmnd = nhap.nextLine();
            System.out.print("Website: ");
            String web = nhap.nextLine();

            if(masv.matches(masvPattern)){}
            else{
                mess += "Mã sinh viên không hợp lệ.\n(Mã sinh viên"
                        + " là 5 chữ cái viết hoa)\n";
            }

            if(pass.matches(passPattern)){}
            else{
                mess += "Mật khẩu không hợp lệ.\n(Mật khẩu phải có"
                        + " ít nhất 6 ký tự)\n";
            }

            if(hoten.matches(hotenPattern)){}
            else{
                mess += "Họ tên không hợp lệ.\n(Họ tên phải là"
                        + " các chữ cái hoặc ký tự trắng)\n";
            }

            if(email.matches(emailPattern)){}
            else{
                mess += "Email không hợp lệ.\n(Email phải chứa"
                        + " ký tự @)\n";
            }

            if(phone.matches(phonePattern)){}
            else{
                mess += "Số điện thoại không hợp lệ.\n(Số điện thoại"
                        + " phải bắt đầu với số 0 và tất cả là 10 số)\n";
            }

            if(bike.matches(bikePattern)){}
            else{
                mess += "Biển số xe không hợp lệ.\n(Biển số xe hợp"
                        + " lệ có dạng như: 29-B1-452-87)\n";
            }

            if(cmnd.matches(cmndPattern)){}
            else{
                mess += "Chứng minh nhân dân không hợp lệ.\n(Số chứng"
                        + " minh nhân dân phải là 9 chữ số)\n";
            }

            if(web.matches(webPattern)){}
            else{
                mess += "Website không hợp lệ.\n(Website hợp lệ có"
                        + " dạng như sau: http://www.nghmanhhieu.vn)\n";
            }

            if(mess.equals("")){
                System.out.println("Đăng nhập thành công!");
                break;
            }
            else{
                System.out.println();
                System.out.println(mess);
                System.out.println("Xin mời nhập lại");
                mess = "";
            }
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}