
package spring.demo.aop;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.demo.aop.dao.AccountDAO;

public class AfterThrowingDemoApp {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        
        List<Account> theAccounts = null;
        try{
            boolean tripWire = true;
            theAccountDAO.findAccounts(tripWire);
        }
        catch(Exception e){
            System.out.println("\nMain program caught exception: " + e);
        }
        
        System.out.println("\nMain Program: AfterReturningDemoApp");
        System.out.println("-----------------------------------");
        System.out.println(theAccounts);
        System.out.println();
        
        context.close();
    }
    
}
