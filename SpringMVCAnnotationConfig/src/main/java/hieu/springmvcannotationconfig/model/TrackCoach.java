package hieu.springmvcannotationconfig.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    
    private String name;
    private byte age;
    private FortuneService fortuneService;
    
    @Value("Phung Thi Hai Yen")
    public void setName(String name){
        this.name = name;
    }
    
    @Value("21")
    public void setAge(byte age){
        this.age = age;
    }
    
    @Autowired
    @Qualifier("sadFortuneService")
    public void setFortuneService(FortuneService fortuneService){
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
        return "Chay 5000 met di.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}