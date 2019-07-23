
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
    
    @Pointcut("execution(* spring.demo.aop.dao.*.get*(..))")
    private void getter(){}
    
    @Pointcut("execution(* spring.demo.aop.dao.*.set*(..))")
    private void setter(){}
    
    @Pointcut("forPackageDAO() && !(getter() || setter())")
    private void forPackageDAONoGetterSetter(){}
    
    @Before("forPackageDAONoGetterSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println("========> Executing @Before advice on addAccount()");
    }
    
    @Before("forPackageDAONoGetterSetter()")
    public void performApiAnalystic(){
        System.out.println("========> Performing API analystics");
    }
}
