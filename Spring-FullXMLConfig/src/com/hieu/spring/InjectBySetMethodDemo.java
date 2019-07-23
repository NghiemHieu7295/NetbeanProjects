package com.hieu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectBySetMethodDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        
        TrackCoach theCoach = context.getBean(TrackCoach.class);
        
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getName());
        System.out.println(theCoach.getAge());
        
        context.close();
    }   
}