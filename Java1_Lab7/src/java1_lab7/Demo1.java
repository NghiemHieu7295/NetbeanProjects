package java1_lab7;

public class Demo1 {

    public static void main(String[] args) {
        NhanVien nv1 = new TruongPhong();
        
        nv1.xuat();
        System.out.println();
        
        nv1.setHoTen("Nghiem Manh Hieu");
        nv1.setLuong(250000);
        nv1.xuat();
        System.out.println();
        
        TruongPhong tp1 = (TruongPhong) nv1;
        tp1.setTrachNhiem(150000);
        tp1.xuat();
        System.out.println();
        
        LaoCong lc1 = new LaoCong();
        lc1.setHoTen("Nghiem Manh Hieu");
        lc1.setLuong(80000);
        lc1.setSoGioLamViec(56);
        lc1.xuat();
        System.out.println();
        
        TruongPhong tp2 = new TruongPhong("Nghiem Manh Tuan", 300000, 200000);
        tp2.xuat();
        System.out.println();
        
        LaoCong lc2 = new LaoCong("Nghiem Manh Hieu", 100000, 60);
        lc2.xuat();
        System.out.println();
        
        NhanVien nv2 = new NhanVien("Nghiem Duc Minh", 200000);
        try{
            LaoCong lc3 = (LaoCong) nv2;
            lc3.setSoGioLamViec(60);
            lc3.xuat();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }   
}