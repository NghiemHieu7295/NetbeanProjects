package hieu.springmvcxmlconfig.model;

public class SwimCoach implements Coach{
    
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
        return "Boi 500 met di.";
    }
    
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
    
    //Init method
    public void doStartup(){
        System.out.println();
        System.out.println("doStartup");
        System.out.println("===============================================");
        System.out.println("I am swim coach bean. I've been instantiated.\n"
                + "I'm being initialized...");
        System.out.println("===============================================");
        System.out.println();
    }
    
    //Destroy method
    public void doCleanup(){
        System.out.println();
        System.out.println("doCleanup");
        System.out.println("===============================================");
        System.out.println("The application context's close() method "
                + "has been called. The Spring container is shutdown.\nI am"
                + " being destroyed.");
        System.out.println("===============================================");
        System.out.println();
    }
}