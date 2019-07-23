
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteObject {

    public static void main(String[] args) {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        cfg.addAnnotatedClass(SinhVien.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        sess.beginTransaction();
        
        // Way 1: Read object with specified id then delete object by session's delete() method
//        System.out.println("Deleting...");
//        
//        SinhVien sv = sess.get(SinhVien.class, "14100007");
//        sess.delete(sv);
//        
//        System.out.println("Done!");
        
        // Way 2: Use HQL, call createQuery() method and call excuteUpdate() method
        System.out.println("Deleting...");
        
        String hql = "Delete From SinhVien Where masv = '14100006'";
        sess.createQuery(hql).executeUpdate();
        
        System.out.println("Done!");
        
        sess.getTransaction().commit();
        sess.close();
        factory.close();
    }   
}