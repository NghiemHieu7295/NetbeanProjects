import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String name = nhap.nextLine();
        System.out.print("Điểm trung bình: ");
        double dtb = nhap.nextDouble();
        System.out.println("Họ và tên: " + name + "\nĐiểm trung bình: "
        + dtb);
    }
}