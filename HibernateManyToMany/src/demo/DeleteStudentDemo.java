
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

public class DeleteStudentDemo {

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
                
                        //get the student by id from database
                        int studentId = 2;
                        Student theStudent = sess.get(Student.class, studentId);
                        
                        //get the courses
                        System.out.println("Loaded student: " + theStudent);
                        System.out.println("Courses: " + theStudent.getCourses());
                        
                        //delete the student
                        System.out.println("Deleting student: " + theStudent);
                        sess.delete(theStudent);
                        
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
