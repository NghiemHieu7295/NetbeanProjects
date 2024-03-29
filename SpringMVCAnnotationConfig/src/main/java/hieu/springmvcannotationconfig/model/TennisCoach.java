package hieu.springmvcannotationconfig.model;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    
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
        return "Tap luyen voi cai vot di.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}