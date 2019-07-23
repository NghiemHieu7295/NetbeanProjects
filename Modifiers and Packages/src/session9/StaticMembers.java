package session9;

public class StaticMembers {
    //Static variable
    public static int staticCounter = 0;
    //Instance variable
    int instanceCounter = 0;
    //Static block
    static{
        System.out.println("I am a static block.");
    }
    
    //Static method
    public static void staticMethod(){
        System.out.println("I am a static method.");
    }
    
    public void displayCount(){
        staticCounter++;
        instanceCounter++;
        
        System.out.println("Static counter is: " + staticCounter);
        System.out.println("Instance counter is: " + instanceCounter);
    }
    
    public static void main(String[] args){
        System.out.println("I am the main method.");
        StaticMembers.staticMethod();
        
        StaticMembers obj1 = new StaticMembers();
        obj1.displayCount();
        StaticMembers obj2 = new StaticMembers();
        obj2.displayCount();
        StaticMembers obj3 = new StaticMembers();
        obj3.displayCount();
    }
}
