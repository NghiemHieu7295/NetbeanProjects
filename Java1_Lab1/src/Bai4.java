import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double a, b, c, d;
        System.out.print("Nhập hệ số a: ");
        a = nhap.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = nhap.nextDouble();
        System.out.print("Nhập hệ số c: ");
        c = nhap.nextDouble();
        
        d = Math.pow(b, 2) - 4 * a * c;
        if(d < 0){
            System.out.println("Delta nhỏ hơn 0.");
        }
        else{
            System.out.println("Delta bằng: " + d);
            System.out.println("Căn Delta bằng: " + Math.sqrt(d));
        }
    }   
}