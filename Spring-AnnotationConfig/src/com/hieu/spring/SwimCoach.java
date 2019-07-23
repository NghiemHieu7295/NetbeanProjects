package com.hieu.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SwimCoach implements Coach{
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
        return "Bơi 5000 mét đi.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}