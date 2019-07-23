
package spring.demo.aop.aspect;

import org.aspectj.lang.JoinPoint;
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
    
    @Before("spring.demo.aop.aspect.AopExpressions.forPackageDAONoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint){
        System.out.println("========> Executing @Before advice on addAccount()");
        
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
