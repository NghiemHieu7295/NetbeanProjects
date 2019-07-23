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
public class GetInstructorDetailDemo {

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
            
            int theId = 3;
            InstructorDetail tempInstructorDetail = sess.get(InstructorDetail.class, theId);
            System.out.println("tempInstructorDetail: " + tempInstructorDetail);
            
            System.out.println("The associated instructor: " + tempInstructorDetail.getInstructor());
            
            sess.getTransaction().commit();
        
        sess.close();
        factory.close();
    }   
}