
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateObject {
    
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(SinhVien.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        sess.beginTransaction();
        
        // Way 1: Read object with specified id then modify information by set() method
        System.out.println("Updating...");
        
        SinhVien sv = sess.get(SinhVien.class, "14100006");
        sv.setHoten("Nghiem Duc Minh");

        System.out.println("Done!");
        
        System.out.println("\n");
        
        // Way 2: Use HQL, call createQuery() method and call excuteUpdate() method
        System.out.println("Updating...");
        
        String hql = "Update SinhVien Set hoten = 'Nghiem Huong Giang' Where masv = '14100007'";
        sess.createQuery(hql).executeUpdate();
        
        System.out.println("Done!");
        
        sess.getTransaction().commit();
        sess.close();
        factory.close();
    }   
}