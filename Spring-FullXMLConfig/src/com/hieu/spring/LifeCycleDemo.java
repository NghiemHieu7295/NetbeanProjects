package com.hieu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        
        SwimCoach theCoach = context.getBean(SwimCoach.class);
        System.out.println();
        
        System.out.println(theCoach.getDailyWorkout());
        
        System.out.println();
        context.close();
    }   
}