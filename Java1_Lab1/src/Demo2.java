import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhập điểm môn a: ");
        int a = scan.nextInt();
        
        System.out.print("Nhập điểm môn b: ");
        int b = scan.nextInt();
        
        System.out.print("Nhập điểm môn c: ");
        int c = scan.nextInt();
        
        double tb = (double) (a * 2 + b + c) / 4;
        System.out.println("Điểm trung bình 3 môn là: " + tb);
    }   
}