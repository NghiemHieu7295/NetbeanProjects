import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
       Scanner nhap = new Scanner(System.in);
       System.out.print("Nhập chiều dài hình chữ nhật: ");
       int dai = nhap.nextInt();
       System.out.print("Nhập chiều rộng hình chữ nhật: ");
       int rong = nhap.nextInt();
       int chuvi = (dai + rong) * 2;
       int dientich = dai * rong;
       System.out.println("Chu vi hình chữ nhật: " + chuvi);
       System.out.println("Diện tích hình chữ nhật: " + dientich);
       System.out.println("Cạnh nhỏ của hình chữ nhật: " + 
               Math.min(dai, rong));
    }
}