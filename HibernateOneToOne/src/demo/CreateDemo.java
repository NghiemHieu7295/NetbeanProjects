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
public class CreateDemo {

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

                Instructor tempInstructor = new Instructor("Gia Thanh", "Phan", "giathanh94@gmail.com");
                InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.giathanh/youtube", "Beer");

                tempInstructor.setInstructorDetail(tempInstructorDetail);

                sess.beginTransaction();

                    System.out.println("Saving Instructor: " + tempInstructor);
                    sess.save(tempInstructor);

                sess.getTransaction().commit();

                System.out.println("Done!");

            sess.close();
        factory.close();
    }
    
}
