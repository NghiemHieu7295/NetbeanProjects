package java1_lab3;

public class Demo1 {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("7 x " + i + " = " + (7*i));
        }
        
        int count = 0, sum = 0;
        for(int num = 27; num <= 250; num++){
            if((num % 3) == 0){
                sum += num;
                count += 1;
            }
        }
        
        System.out.println("Trung bình cộng của các số chia hết cho 3 "
                + "từ 27 đến 250 là: " + (double) sum / count);
    }   
}