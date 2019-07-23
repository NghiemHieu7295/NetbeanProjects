/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import entities.Course;
import entities.Instructor;
import entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Hieu
 */
public class CreateCourseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Instructor.class);
        cfg.addAnnotatedClass(InstructorDetail.class);
        cfg.addAnnotatedClass(Course.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        
            sess.beginTransaction();
            
            int theId = 1;
            Instructor tempInstructor = sess.get(Instructor.class, theId);
            
            Course course1 = new Course("Guitar");
            Course course2 = new Course("Piano");
            
            tempInstructor.addCourse(course1);
            tempInstructor.addCourse(course2);
            
            System.out.println("Saving course...");
            sess.save(course1);
            sess.save(course2);
            
            sess.getTransaction().commit();
            System.out.println("Done!");
        
        sess.close();
        factory.close();
    }   
}