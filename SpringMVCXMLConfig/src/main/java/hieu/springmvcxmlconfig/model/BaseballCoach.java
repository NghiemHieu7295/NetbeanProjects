package hieu.springmvcxmlconfig.model;

public class BaseballCoach implements Coach{
    
    private FortuneService fortuneService;
    private String name;
    private byte age;
    
    public BaseballCoach(){}
    
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
        return "Tap danh bong 1000 cai.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}