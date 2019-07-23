/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import entities.Course;
import entities.Instructor;
import entities.InstructorDetail;
import entities.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Hieu
 */
public class GetCourseAndReviewsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate2.cfg.xml");
        cfg.addAnnotatedClass(Instructor.class);
        cfg.addAnnotatedClass(InstructorDetail.class);
        cfg.addAnnotatedClass(Course.class);
        cfg.addAnnotatedClass(Review.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        
            sess.beginTransaction();
            
                //get the course
                int theId = 10;
                Course tempCourse = sess.get(Course.class, theId);
                
                //print the course
                System.out.println(tempCourse);
                
                //print the course reviews
                System.out.println(tempCourse.getReviews());
                
            sess.getTransaction().commit();
            
            System.out.println("Done!");
        sess.close();
        factory.close();
    }   
}