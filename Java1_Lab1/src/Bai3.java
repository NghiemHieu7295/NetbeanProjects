import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int canh, thetich;
        System.out.print("Nhập cạnh của khối lập phương: ");
        canh = nhap.nextInt();
        thetich = canh * canh * canh;
        System.out.println("Thể tích của khối lập phương: " + thetich);
    }   
}