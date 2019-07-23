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
public class CreateInstructorDemo {

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
            
            try{
                Instructor tempInstructor = new Instructor("Hieu", "Nghiem", "nmh7295@gmail.com");
                InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com/nghiemhieu", "Music");
                
                tempInstructor.setInstructorDetail(tempInstructorDetail);
                
                System.out.println("Saving new instructor...");
                sess.save(tempInstructor);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
            sess.getTransaction().commit();
            System.out.println("Done!");
        
        sess.close();
        factory.close();
    }   
}