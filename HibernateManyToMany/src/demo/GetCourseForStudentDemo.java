
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

public class GetCourseForStudentDemo {

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
                
                        //Get the student from database by id
                        int studentId = 1;
                        Student theStudent = sess.get(Student.class, studentId);
                        
                        //Get courses for the student
                        System.out.println("Loaded student: " + theStudent);
                        System.out.println("Courses: " + theStudent.getCourses());
                        
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
