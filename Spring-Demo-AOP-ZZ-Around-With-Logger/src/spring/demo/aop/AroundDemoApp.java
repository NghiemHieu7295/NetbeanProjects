
package spring.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.demo.aop.service.TrafficFortuneService;

public class AroundDemoApp {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        
        TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
        System.out.println("\nMain Program: AroundDemoApp");
        System.out.println("Calling getFortune");
        
        String data = theFortuneService.getFortune();
        
        System.out.println("\nMy fortune is: " + data);
        System.out.println("Finished");
        
        context.close();
    }
    
}
