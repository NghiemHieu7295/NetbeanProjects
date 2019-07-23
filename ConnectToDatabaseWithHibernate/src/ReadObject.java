
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ReadObject {

    public static void main(String[] args) {
        
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(SinhVien.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        
        // SQL: Select * From sinhvien
        Transaction ts = sess.beginTransaction();
        
        String hql1 = "from SinhVien";
        Query qr1 = sess.createQuery(hql1);
        List<SinhVien> list1 = qr1.getResultList();
        
        ts.commit();
        
        System.out.println("Select * From sinhvien");
        System.out.println("----------------------");
        for(SinhVien sv : list1){
            System.out.println(sv);
        }
        
        System.out.println("\n");
        
        // SQL: Select * From sinhvien where HoTen = 'Nghiem Manh Hieu'
        ts = sess.beginTransaction();
        
        String hql2 = "from SinhVien sv where sv.hoten='Nghiem Manh Hieu'";
        Query qr2 = sess.createQuery(hql2);
        List<SinhVien> list2 = qr2.getResultList();
        
        ts.commit();
        
        System.out.println("Select * From sinhvien\nWhere HoTen = 'Nghiem Manh Hieu'");
        System.out.println("-------------------------------------------------------");
        for(SinhVien sv : list2){
            System.out.println(sv);
        }
        
        System.out.println("\n");
        
        // SQL: Select * From sinhvien where HoTen like 'Nghiem%'
        ts = sess.beginTransaction();
        
        String hql3 = "from SinhVien sv where sv.hoten like 'Nghiem%' or sv.hoten like 'Luong%'";
        Query qr3 = sess.createQuery(hql3);
        List<SinhVien> list3 = qr3.getResultList();
        
        ts.commit();
        
        System.out.println("Select * From sinhvien\nWhere HoTen Like 'Nghiem%' Or HoTen Like 'Luong%'");
        System.out.println("----------------------------------------");
        for(SinhVien sv : list3){
            System.out.println(sv);
        }
        
        System.out.println("\n");
        
        // SQL: Select MaSV, HoTen, NgaySinh From sinhvien
        ts = sess.beginTransaction();
        
        String hql4 = "Select sv.masv, sv.hoten, sv.ngaysinh From SinhVien sv";
        Query qr4 = sess.createQuery(hql4);
        List<Object[]> list4 = (List<Object[]>) qr4.getResultList();
        
        ts.commit();
        
        System.out.println("Select MaSV, HoTen, NgaySinh From sinhvien");
        System.out.println("------------------------------------------");
        for(Object[] props : list4){
            System.out.println(props[0] + " " + props[1] + " " + DateUtils.formatDate((Date) props[2]));
        }
        
        sess.close(); 
        factory.close();
    }   
}