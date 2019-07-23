package java2_lab3;

import java.io.File;

public class TaoThuMuc {

    public static void main(String[] args) {
        File dir = new File("test");
        if(dir.exists()){}
        else{
            dir.mkdir();
        }
    }   
}