package com.hieu.spring;

public class TennisCoach implements Coach{
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
        return "Tập luyện với cái vợt đi.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}