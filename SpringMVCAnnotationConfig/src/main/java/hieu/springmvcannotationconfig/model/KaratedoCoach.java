package hieu.springmvcannotationconfig.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class KaratedoCoach implements Coach{
    
    private String name;
    private byte age;
    private FortuneService fortuneService;
    
    public String getName(){
        return name;
    }
    
    public byte getAge(){
        return age;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Tap dam 200 qua.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
    
    @PostConstruct
    public void doStartup(){
        System.out.println();
        System.out.println("KARATEDO BEAN - doStartup");
        System.out.println("-------------------------");
        System.out.println("I've been instantiated. I'm being initialized...");
        System.out.println();
    }
    
    @PreDestroy
    public void doCleanup(){
        System.out.println();
        System.out.println("KARATEDO BEAN - doCleanup");
        System.out.println("-------------------------");
        System.out.println("The application context's close() method is called."
                + " The spring container shutdowned. I'm being destroyed...");
        System.out.println();
    }
}