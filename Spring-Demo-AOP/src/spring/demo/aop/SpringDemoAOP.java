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
        theMembershipDAO.addAccount();
        
        context.close();
    }   
}