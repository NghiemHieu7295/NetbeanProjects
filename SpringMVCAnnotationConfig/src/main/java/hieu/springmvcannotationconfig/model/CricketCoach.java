package hieu.springmvcannotationconfig.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    
    @Value("Phan Gia Thanh")
    private String name;
    
    @Value("25")
    private byte age;
    
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    
    public String getName(){
        return name;
    }
    
    public byte getAge(){
        return age;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Choi cricket 1 tieng di.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}