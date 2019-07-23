package com.hieu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        
        System.out.println("Scope: Singleton (default)");
        System.out.println("--------------------------");
        TennisCoach tnCoach1 = context.getBean(TennisCoach.class);
        TennisCoach tnCoach2 = context.getBean(TennisCoach.class);
        System.out.println("tnCoach1 and tnCoach2 are same? " + (tnCoach1 == tnCoach2));
        System.out.println("Memory location of tnCoach1 is: " + tnCoach1);
        System.out.println("Memory location of tnCoach2 is: " + tnCoach2);
        
        System.out.println();
        
        System.out.println("Scope: Prototype");
        System.out.println("----------------");
        SwimCoach swCoach1 = context.getBean(SwimCoach.class);
        SwimCoach swCoach2 = context.getBean(SwimCoach.class);
        System.out.println("swCoach1 and swCoach2 are same? " + (swCoach1 == swCoach2));
        System.out.println("Memory location of swCoach1 is: " + swCoach1);
        System.out.println("Memory location of swCoach2 is: " + swCoach2);
    }   
}