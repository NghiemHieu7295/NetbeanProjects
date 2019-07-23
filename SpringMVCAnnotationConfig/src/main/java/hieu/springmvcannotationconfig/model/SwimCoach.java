package hieu.springmvcannotationconfig.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SwimCoach implements Coach{
    
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
        return "Boi 500 met di";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}