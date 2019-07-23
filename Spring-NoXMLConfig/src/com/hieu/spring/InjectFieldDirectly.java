package com.hieu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectFieldDirectly {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        
        CricketCoach theCoach = context.getBean(CricketCoach.class);
        
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getName());
        System.out.println(theCoach.getAge());
        
        context.close();
    }   
}