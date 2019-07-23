package hieu.springmvcxmlconfig.model;

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
        return "Luyen tap 30 phut di.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}