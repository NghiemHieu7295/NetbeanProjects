package com.hieu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    
    private FortuneService fortuneService;
    private String name;
    private byte age;
    
    @Autowired
    public BaseballCoach(@Qualifier("happyFortuneService")FortuneService fortuneService, 
            @Value("${name}")String name, @Value("${age}")byte age){
        this.fortuneService = fortuneService;
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public byte getAge(){
        return age;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Tập bóng chày 30 phút đi.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}