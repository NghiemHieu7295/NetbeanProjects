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
public class CreateCourseAndReviewsDemo {

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
            
                //create a course
                Course tempCourse = new Course("Karatedo");
                
                // add some reviews
                tempCourse.addReview(new Review("Cool course! Loved it!"));
                tempCourse.addReview(new Review("Nice! I love karatedo!"));
                tempCourse.addReview(new Review("Uhhhh ... i hate karatedo!"));
                
                //save the course... and leverage the cascade all
                System.out.println("Saving the course...");
                System.out.println(tempCourse);
                System.out.println(tempCourse.getReviews());
                
                sess.save(tempCourse);
                
            sess.getTransaction().commit();
            
            System.out.println("Done!");
        sess.close();
        factory.close();
    }   
}