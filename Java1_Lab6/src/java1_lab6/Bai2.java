package java1_lab6;

import java.util.ArrayList;

public class Bai2 {

    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        int i = 0;
        
        do{
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
            i += 1;
        }while(i < 5);
        
        System.out.println();
        
        for(SanPham sp : list){
            if(sp.getHang().equalsIgnoreCase("Nokia")){
                sp.xuat();
            }
        }
    }   
}