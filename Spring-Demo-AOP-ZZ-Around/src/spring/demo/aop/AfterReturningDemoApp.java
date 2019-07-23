
package spring.demo.aop;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.demo.aop.dao.AccountDAO;

public class AfterReturningDemoApp {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        
        List<Account> theAccounts = theAccountDAO.findAccounts(false);
        
        System.out.println("\nMain Program: AfterReturningDemoApp");
        System.out.println("-----------------------------------");
        System.out.println(theAccounts);
        System.out.println();
        
        context.close();
    }
    
}
