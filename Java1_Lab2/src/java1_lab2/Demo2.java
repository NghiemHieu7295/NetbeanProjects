package java1_lab2;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhập tiền lương: ");
        double salary = scan.nextDouble();
        double incomeTax;
        
        if(salary < 9000000){
            incomeTax = 0.0;
        }
        else if((salary >= 9000000) && (salary <= 15000000)){
            incomeTax = salary * 0.1;
        }
        else if((salary > 15000000) && (salary <= 30000000)){
            incomeTax = salary * 0.15;
        }
        else{
            incomeTax = salary * 0.2;
        }
        
        System.out.println("Thuế thu nhập: " + incomeTax);
    }   
}