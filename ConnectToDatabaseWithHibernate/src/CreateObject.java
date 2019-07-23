
import java.text.ParseException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateObject {
    
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(SinhVien.class);

        // Create factory
        SessionFactory factory = cfg.buildSessionFactory();
        try{
            // Create session
            Session sess = factory.openSession();

            SinhVien sv = new SinhVien();
            sv.setMasv("14100007");
            sv.setHoten("Nghiem Manh Tuan");
            sv.setGioitinh("Nam");
            sv.setNgaysinh(DateUtils.parseDate("17/06/1995"));
            sv.setQuequan("Ha Noi");
            sv.setManganh("TH");
            sv.setMakhoa("K19");
            sv.setMalop("TH19.22");

            sess.beginTransaction();
            sess.save(sv);

            sess.getTransaction().commit();
            
            sess.close();
            System.out.println("Create and save student successfully!");
            
        }
        catch(ParseException | HibernateException e){
            System.out.println(e.getMessage());
        }
        finally{
            factory.close();
        }
    }   
}