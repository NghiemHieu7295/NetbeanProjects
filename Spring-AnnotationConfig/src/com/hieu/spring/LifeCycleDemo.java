package com.hieu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        
        KaratedoCoach theCoach = context.getBean(KaratedoCoach.class);
        
        context.close();
    }   
}