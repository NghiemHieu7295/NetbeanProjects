package java1_lab5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
            System.out.println("Câu hỏi thứ " + (i + 1) + ":");
            a.add(nhap.nextLine());
        }
        
        //binarySearch, fill, shuffle, sort, reverse, rotate, swap
        Collections.shuffle(a);
        System.out.println();
        
        a.forEach((s) -> {
            System.out.println(s);
        });
    }   
}