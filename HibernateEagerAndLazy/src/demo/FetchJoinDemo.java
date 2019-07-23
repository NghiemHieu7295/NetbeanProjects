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
import org.hibernate.query.Query;

/**
 *
 * @author Hieu
 */
public class FetchJoinDemo {

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
                
                String hql = "Select i from Instructor i "
                        + "JOIN FETCH i.courses "
                        + "Where i.id=:theInstructorId";
                
                Query<Instructor> query = sess.createQuery(hql, Instructor.class);
                
                query.setParameter("theInstructorId", theId);
                
                Instructor tempInstructor = query.getSingleResult();
                
                System.out.println("Instructor: " + tempInstructor);
            
            sess.getTransaction().commit();
        
            System.out.println("Done!");
        sess.close();
        
        System.out.println("\nThe session is now closed.\n");
        
        System.out.println("Courses: " + tempInstructor.getCourses());
        
        factory.close();
    }   
}