
package spring.demo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    
    //this is where we add all of our related advices for logging
    //let's start with an @Before advice
    
    @Before("execution(* spring.demo.aop.dao.*.*(..))")
    public void beforeAddAccountAdvice(){
        System.out.println("========> Executing @Before advice on addAccount()");
    }
}
