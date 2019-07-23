package com.hieu.spring;

public class CricketCoach implements Coach{
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
        return "Luyện tập 30 phút đi.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}