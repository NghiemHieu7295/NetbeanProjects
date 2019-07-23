package hieu.springmvcannotationconfig.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
    
    @Value("${name}")
    private String name;
    
    @Value("${age}")
    private byte age;
    
    @Autowired
    @Qualifier("sadFortuneService")
    private FortuneService fortuneService;
    
    public String getName(){
        return name;
    }
    
    public byte getAge(){
        return age;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Sut 100 qua di.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}