package com.hieu.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class KaratedoCoach implements Coach{
    private FortuneService fortuneService;
    private String name;
    private byte age;
    
    public KaratedoCoach(){
        System.out.println("I'm being instantiated.\n");
    }
    
    public String getName(){
        return name;
    }
    
    public byte getAge(){
        return age;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Đá 1000 cái, đấm 1000 cái.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
    
    @PostConstruct
    public void doStartup(){
        System.out.println("I'm being initialized.\n");
    }
    
    @PreDestroy
    public void doCleanup(){
        System.out.println("I'm being destroyed.");
    }
}