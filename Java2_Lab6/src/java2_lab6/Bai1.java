package java2_lab6;

import java.util.ArrayList;

public class Bai1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        list.add(10);
        list.add(15.2);
        list.add(true);
        list.add("Hello");
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }   
}