package hieu.springmvcxmlconfig.model;

public class TrackCoach implements Coach{
    
    private FortuneService fortuneService;
    private String name;
    private byte age;
    
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
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
        return "Chay 5000 met.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}