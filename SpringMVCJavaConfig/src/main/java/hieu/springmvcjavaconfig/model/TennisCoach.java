package hieu.springmvcjavaconfig.model;

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
    public String getDailyWorkout() {
        return "Tap luyen voi cai vot di.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}