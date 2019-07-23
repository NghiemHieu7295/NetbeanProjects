
package spring.demo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    
    @Pointcut("execution(* spring.demo.aop.dao.*.*(..))")
    private void forPackageDAO(){}    
    
    @Before("forPackageDAO()")
    public void beforeAddAccountAdvice(){
        System.out.println("========> Executing @Before advice on addAccount()");
    }
    
    @Before("forPackageDAO()")
    public void performApiAnalystic(){
        System.out.println("========> Performing API analystics");
    }
}
