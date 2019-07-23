package hieu.springmvcjavaconfig.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class KaratedoCoach implements Coach{
    
    private FortuneService fortuneService;
    private String name;
    private byte age;
    
    public String getName(){
        return name;
    }
    
    public byte getAge(){
        return age;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Tap dam 100 cai.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
    
    @PostConstruct
    public void doStartup(){
        System.out.println();
        System.out.println("doStartup");
        System.out.println("===============================================");
        System.out.println("I am karatedo coach bean. I've been instantiated.\n"
                + "I'm being initialized...");
        System.out.println("===============================================");
        System.out.println();
    }
    
    @PreDestroy
    public void doCleanup(){
        System.out.println();
        System.out.println("doCleanup");
        System.out.println("===============================================");
        System.out.println("The application context's close() method "
                + "has been called. The Spring container is shutdown.\nI am"
                + " being destroyed.");
        System.out.println("===============================================");
        System.out.println();
    }
}