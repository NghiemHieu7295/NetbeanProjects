package com.hieu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    
    private FortuneService fortuneService;
    private String name;
    private byte age;
    
    @Autowired
    @Qualifier("sadFortuneService")
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    
    @Value("${name}")
    public void setName(String name){
        this.name = name;
    }
    
    @Value("${age}")
    public void setAge(byte age){
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
        return "Chạy 5000 mét đi.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}