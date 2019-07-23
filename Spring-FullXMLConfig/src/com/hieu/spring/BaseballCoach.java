package com.hieu.spring;

public class BaseballCoach implements Coach{
    
    private FortuneService fortuneService;
    private String name;
    private byte age;
    
    public BaseballCoach(FortuneService fortuneService, String name, byte age){
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
        return "Tập đánh bóng 1000 cái.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}