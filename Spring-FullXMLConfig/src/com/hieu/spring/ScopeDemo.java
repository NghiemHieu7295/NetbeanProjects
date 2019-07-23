package com.hieu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        
        System.out.println("Scope: Singleton (default)");
        System.out.println("--------------------------");
        CricketCoach ckCoach1 = context.getBean(CricketCoach.class);
        CricketCoach ckCoach2 = context.getBean(CricketCoach.class);
        System.out.println("ckCoach1 and ckCoach2 are same? " + (ckCoach1 == ckCoach2));
        System.out.println("Memory location of ckCoach1 is: " + ckCoach1);
        System.out.println("Memory location of ckCoach2 is: " + ckCoach2);
        
        System.out.println();
        
        System.out.println("Scope: Prototype");
        System.out.println("----------------");
        TennisCoach tnCoach1 = context.getBean(TennisCoach.class);
        TennisCoach tnCoach2 = context.getBean(TennisCoach.class);
        System.out.println("tnCoach1 and tnCoach2 are same? " + (tnCoach1 == tnCoach2));
        System.out.println("Memory location of tnCoach1 is: " + tnCoach1);
        System.out.println("Memory location of tnCoach2 is: " + tnCoach2);
        
        context.close();
    }   
}