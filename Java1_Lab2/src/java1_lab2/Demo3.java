package java1_lab2;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhập năm: ");
        short year = scan.nextShort();
        
        System.out.print("Nhập tháng: ");
        byte month = scan.nextByte();
        
        byte days = 0;
        
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if((year % 4) == 0){
                    days = 29;
                }
                else{
                    days = 28;
                }
                break;
        }
        
        System.out.println("Tháng " + month + " năm " + year + " có " +
                days + " ngày.");
    }   
}