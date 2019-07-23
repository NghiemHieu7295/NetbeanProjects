
package demo;

import org.hibernate.cfg.Configuration;
import entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddCourseForStudentDemo {

    public static void main(String[] args){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Instructor.class)
           .addAnnotatedClass(InstructorDetail.class)
           .addAnnotatedClass(Course.class)
           .addAnnotatedClass(Review.class)
           .addAnnotatedClass(Student.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
            
            Session sess = factory.openSession();
            
                Transaction ts = sess.beginTransaction();
                
                    //get the student from database by id
                    int studentId = 1;
                    Student theStudent = sess.get(Student.class, studentId);
                
                    System.out.println("Loaded student: " + theStudent);
                    System.out.println("Courses: " + theStudent.getCourses());
                    
                    //create more courses
                    Course course1 = new Course("Rubik's Cube - How To Speed Cube");
                    Course course2 = new Course("Atari 2600 - Game Development");
                    
                    //add student to courses
                    course1.addStudent(theStudent);
                    course2.addStudent(theStudent);
                    
                    //save the courses
                    System.out.println("Saving the courses...");
                    
                    sess.save(course1);
                    sess.save(course2);
                    
                ts.commit();
            
            sess.close();
        
        factory.close();
    }
}
