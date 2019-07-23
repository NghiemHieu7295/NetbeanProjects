
package demo;

import entities.Course;
import entities.Instructor;
import entities.InstructorDetail;
import entities.Review;
import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteCourseDemo {

    public static void main(String[] args) {
        
        //Create configuration object to use hibernate
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Instructor.class)
           .addAnnotatedClass(InstructorDetail.class)
           .addAnnotatedClass(Course.class)
           .addAnnotatedClass(Review.class)
           .addAnnotatedClass(Student.class);
        
        //Create session factory
        SessionFactory factory = cfg.buildSessionFactory();
            
            //Open the session
            Session sess = factory.openSession();
                
                try{
                    Transaction ts = sess.beginTransaction();
                
                        //get the pacman course from database
                        int courseId = 1;
                        Course theCourse = sess.get(Course.class, courseId);
                        
                        //delete the pacman course
                        System.out.println("Deleting course...");
                        sess.delete(theCourse);
                        
                        System.out.println("Deleting done!");
                        
                    ts.commit();
                    System.out.println("Every thing is done!");
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            
            sess.close();
        
        factory.close();
    }
    
}
