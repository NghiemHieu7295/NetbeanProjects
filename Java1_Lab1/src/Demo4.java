import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int randomNum = 5 + (int) (Math.random() * ((12 - 5) + 1));
        System.out.println("Số ngẫu nhiên từ 5 đến 12: " + randomNum);
        System.out.println("Căn bậc 2 của số ngẫu nhiên: " + Math.sqrt(randomNum));
        System.out.println();
        
        System.out.print("Nhập số thực a: ");
        double a = scan.nextDouble();
        System.out.print("Nhập số thực b: ");
        double b = scan.nextDouble();
        
        System.out.println("a lũy thừa b bằng: " + Math.pow(a, b));
        System.out.println("Số nhỏ hơn trong 2 số a, b là: " + Math.min(a, b));
    }
}