package java1_lab6;

import java.util.ArrayList;

public class Bai3 {

    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        int i = 0;
        
        do{
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
            System.out.println();
            i += 1;
        }while(i < 5);
        
        for(SinhVien sv : list){
            sv.xuat();
        }
    }   
}