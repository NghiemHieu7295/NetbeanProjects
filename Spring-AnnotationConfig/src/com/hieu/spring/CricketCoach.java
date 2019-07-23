package com.hieu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    
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
        return "Chơi cricket 1 tiếng đi.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}