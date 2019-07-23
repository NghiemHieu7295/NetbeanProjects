
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

public class CreateCourseAndStudentDemo {

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
                
                        //Create the course
                        //Course theCourse = new Course("Pacman - How To Score One Million Points");

                        //Save the course
                        //sess.save(theCourse);
                        
                        //Get the course by id
                        Course theCourse = sess.get(Course.class, 1);
                        
                        //Create the students
                        Student student1 = new Student("John", "Doe", "john@gmail.com");
                        Student student2 = new Student("Mary", "Lasky", "mary@gmail.com");
                        
                        //Add students to the course
                        theCourse.addStudent(student1);
                        theCourse.addStudent(student2);
                        
                        //Save the students
                        sess.save(student1);
                        sess.save(student2);
                        
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
