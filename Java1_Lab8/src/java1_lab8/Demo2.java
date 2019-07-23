package java1_lab8;

public class Demo2 {

    void m(int x){
        x += 5;
    }
    
    void m(int[] x){
        x[0] += 5;
    }
    
    void m(SinhVien sv){
        sv.hoTen += "Nghiem Manh Hieu";
        sv.tuoi += 24;
    }
    
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        int x = 10;
        obj.m(x);
        System.out.println(x);
        
        int[] y = {4, 5, 7, 8, 9};
        obj.m(y);
        System.out.println(y[0]);
        
        SinhVien sv = new SinhVien();
        System.out.println(sv.hoTen + " " + sv.tuoi);
        obj.m(sv);
        System.out.println(sv.hoTen + " " + sv.tuoi);
    }   
}