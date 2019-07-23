package hieu.springmvcjavaconfig.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class SoccerCoach implements Coach{
    
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    
    @Value("${name}")
    private String name;
    
    @Value("${age}")
    private byte age;
    
    public String getName(){
        return name;
    }
    
    public byte getAge(){
        return age;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Sut bong 100 lan.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}