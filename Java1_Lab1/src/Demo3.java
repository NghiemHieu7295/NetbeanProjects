import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Họ tên: ");
        String name = scan.nextLine();
        
        System.out.print("Tuổi: ");
        int age = scan.nextInt();
        
        System.out.print(name + " năm nay " + age + " tuổi.\n\n");
        
        System.out.println(name + " năm nay " + age + " tuổi.\n");
        
        System.out.printf("%s năm nay %d tuổi.\n", name, age);
    }   
}