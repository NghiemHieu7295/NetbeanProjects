/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import entities.Instructor;
import entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Hieu
 */
public class DeleteDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Instructor.class);
        cfg.addAnnotatedClass(InstructorDetail.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        
            sess.beginTransaction();
            
            int theId = 1;
            Instructor tempInstructor = sess.get(Instructor.class, theId);
            
            System.out.println("Found instructor: " + tempInstructor);
            
            if(tempInstructor != null){
                System.out.println("Deleting: " + tempInstructor);
                sess.delete(tempInstructor);
            }
            
            System.out.println("Done!");
            sess.getTransaction().commit();
        
        sess.close();
        factory.close();
    }
    
}
