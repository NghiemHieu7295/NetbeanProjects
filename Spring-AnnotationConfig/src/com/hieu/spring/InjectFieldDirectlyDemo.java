package com.hieu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectFieldDirectlyDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        
        CricketCoach theCoach = context.getBean(CricketCoach.class);
        
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getName());
        System.out.println(theCoach.getAge());
        
        context.close();
    }   
}