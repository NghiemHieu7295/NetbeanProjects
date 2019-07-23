package java2_lab5;

import java.util.Scanner;

public class Bai3 {
    @Deprecated
    public boolean cardNumber(String card){
        String[] nums = card.split(" ");
        int sum = 0;
        
        for(String s : nums){
            sum = sum + Integer.parseInt(s);
        }
        
        if((sum % 2) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Bai3 obj = new Bai3();
        Scanner nhap = new Scanner(System.in);
        String pattern = "[0-9 ]+";
        String cardNumber;
        
        while(true){
            System.out.print("Nhập số thẻ sinh viên: ");
            String card = nhap.nextLine();
            if(card.matches(pattern)){
                cardNumber = card;
                break;
            }
            else{
                System.out.println("Nhập lại. Mã số thẻ chỉ chứa"
                        + " số và ký tự trắng.");
            }
        }
        
        System.out.println(obj.cardNumber(cardNumber));
    }   
}