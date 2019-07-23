package com.hieu.spring;

import org.springframework.beans.factory.annotation.Value;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;
    @Value("${name}")
    private String name;
    @Value("${age}")
    private byte age;
    
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
        return "Chạy 5000 mét.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}