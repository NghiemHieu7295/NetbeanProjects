package com.hieu.spring;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;
    private String name;
    private byte age;
    
    public SwimCoach(){
        System.out.println("I am being instantiated...");
    }
    
    public String getName(){
        return name;
    }
    
    public byte getAge(){
        return age;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Bơi 5000 mét nhé.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
    
    //init method
    public void doStartup(){
        System.out.println("I am swimCoach bean. I have been instantiated.\n"
                + "I am being initialized...");
    }
    
    //destroy method
    public void doCleanup(){
        System.out.println("The application context's close() method has been "
                + "called. The Spring container is shutdown.\nI am being destroyed...");
    }
}