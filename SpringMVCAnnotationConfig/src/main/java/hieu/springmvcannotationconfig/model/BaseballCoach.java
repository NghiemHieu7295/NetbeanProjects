package hieu.springmvcannotationconfig.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    
    private String name;
    private byte age;
    private FortuneService fortuneService;
    
    public BaseballCoach(){}
    
    @Autowired
    public BaseballCoach(@Value("Nghiem Manh Hieu") String name, @Value("24") byte age,
            @Qualifier("happyFortuneService") FortuneService fortuneService){
        this.name = name;
        this.age = age;
        this.fortuneService = fortuneService;
    }
    
    public String getName(){
        return name;
    }
    
    public byte getAge(){
        return age;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Tap bong chay 1 tieng di.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}