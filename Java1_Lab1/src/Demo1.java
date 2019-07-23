import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhập số a: ");
        int a = scan.nextInt();
        
        System.out.print("Nhập số b: ");
        int b = scan.nextInt();
        
        int c = a + b;
        
        System.out.println("Tổng 2 số vừa nhập là: " + c);
    }   
}