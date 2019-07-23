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
public class EagerLazyDemo {

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
                
                System.out.println("Instructor: " + tempInstructor);
                
                System.out.println("Courses: " + tempInstructor.getCourses());
            
            sess.getTransaction().commit();
        
            System.out.println("Done!");
        sess.close();
        
        System.out.println("\nThe session is now closed!\n");
        
        System.out.println("Courses: " + tempInstructor.getCourses());
        
        factory.close();
    }   
}