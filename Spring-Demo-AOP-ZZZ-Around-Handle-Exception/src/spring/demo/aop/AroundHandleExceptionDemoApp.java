
package spring.demo.aop;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.demo.aop.service.TrafficFortuneService;

public class AroundHandleExceptionDemoApp {

    private static Logger myLogger = Logger.getLogger(AroundHandleExceptionDemoApp.class.getName());
    
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        
        TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
        myLogger.info("\nMain Program: AroundDemoApp");
        myLogger.info("Calling getFortune");
        
        boolean tripWire = true;
        String data = theFortuneService.getFortune(tripWire);
        
        myLogger.log(Level.INFO, "\nMy fortune is: {0}", data);
        myLogger.info("Finished");
        
        context.close();
    }
    
}
