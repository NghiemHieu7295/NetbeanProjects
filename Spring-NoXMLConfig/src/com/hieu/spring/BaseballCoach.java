package com.hieu.spring;

import org.springframework.beans.factory.annotation.Value;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;
    @Value("${name}")
    private String name;
    @Value("${age}")
    private byte age;
    
    public BaseballCoach(FortuneService fortuneService){
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
        return "Tập bóng chày 1 tiếng.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}