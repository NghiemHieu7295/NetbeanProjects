package java1_lab3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SinhVien[] arr = new SinhVien[5];
        
        for(byte i = 0; i < 5; i++){
            System.out.println("Sinh viên thứ " + (i+1) + ":");
            System.out.print("Họ tên: ");
            String ten = scan.nextLine();
            System.out.print("Tuổi: ");
            byte tuoi = scan.nextByte();
            scan.nextLine();
            
            arr[i] = new SinhVien();
            arr[i].setHoten(ten);
            arr[i].setTuoi(tuoi);
            
            System.out.println();
        }
        
        Arrays.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoten().compareTo(o2.getHoten());
            }
        });
        
        for(byte i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }   
}