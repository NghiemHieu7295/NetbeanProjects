package spring.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.demo.aop.dao.AccountDAO;
import spring.demo.aop.dao.MembershipDAO;

public class SpringDemoAOP {

    public static void main(String[] args) {
        
        //Read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        
        Account myAcc = new Account();
        theAccountDAO.addAccount(myAcc, true);
        
        System.out.println();
        
        theAccountDAO.doWork();
        
        System.out.println();
        
        theAccountDAO.setName("foobar");
        theAccountDAO.setServiceCode("silver");
        
        System.out.println();
        
        String name = theAccountDAO.getName();
        String serviceCode = theAccountDAO.getServiceCode();
        
        System.out.println();
        
        theMembershipDAO.addSillyMember();
        
        System.out.println();
        
        theMembershipDAO.goToSleep();
        
        context.close();
    }   
}