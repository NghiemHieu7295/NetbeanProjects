
package spring.demo.aop.aspect;

import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.demo.aop.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
    
    private void convertAccountNamesToUpperCase(List<Account> result){
        for(Account tempAccount : result){
            String theUpperName = tempAccount.getName().toUpperCase();
            tempAccount.setName(theUpperName);
        }
    }
    
    @AfterReturning(pointcut = "execution(* spring.demo.aop.dao.AccountDAO.findAccounts(..))", returning = "result")
    public void afterReturningFindAccountAdvice(JoinPoint theJoinPoint, List<Account> result){
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n============> Executing @AfterReturning on method: " + method);
        System.out.println("\n============> Result is: " + result);
        convertAccountNamesToUpperCase(result);
        System.out.println("\n============> Result is: " + result);
    }
    
    @Before("spring.demo.aop.aspect.AopExpressions.forPackageDAONoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint){
        System.out.println("\n========> Executing @Before advice on addAccount()");
        
        // display the method signature
        MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
        System.out.println("Method: " + methodSig);
        
        // display method arguments
        Object[] args = theJoinPoint.getArgs();
        for(Object arg : args){
            System.out.println(arg);
            if(arg instanceof Account){
                Account theAccount = (Account) arg;
                System.out.println("Account name: " + theAccount.getName());
                System.out.println("Account level: " + theAccount.getLevel());
            }
        }
    }
}
