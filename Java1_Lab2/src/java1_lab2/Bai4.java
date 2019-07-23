package java1_lab2;

import java.util.Scanner;

public class Bai4 extends Bai3{

    public static void main(String[] args) {
        Bai4 obj = new Bai4();
        Scanner nhap = new Scanner(System.in);
        String tieptuc = "yes";
        int luachon;
        while(tieptuc.equals("yes")){
            System.out.println("+-------------------------+");
            System.out.println("1. Giải phương trình bậc 1.");
            System.out.println("2. Giải phương trình bậc 2.");
            System.out.println("3. Tính tiền điện.");
            System.out.println("4. Kết thúc.");
            System.out.println("+-------------------------+");
            System.out.print("Hãy chọn chức năng: ");
            luachon = nhap.nextInt();
            nhap.nextLine();
            switch(luachon){
                case 1:
                    obj.GPTBN();
                    break;
                case 2:
                    obj.GPTBH();
                    break;
                case 3:
                    obj.Tinhtiendien();
                    break;
                case 4:
                    break;
            }
            System.out.println("Bạn có muốn sử dụng chương trình"
                    + " nữa không? (yes/no)");
            tieptuc = nhap.nextLine();
        }
        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
    }   
}