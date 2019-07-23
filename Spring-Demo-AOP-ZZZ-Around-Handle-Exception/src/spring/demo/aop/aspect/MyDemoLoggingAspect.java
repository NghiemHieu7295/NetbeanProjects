
package spring.demo.aop.aspect;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
    
    private Logger myLogger = Logger.getLogger(getClass().getName());
    
    private void convertAccountNamesToUpperCase(List<Account> result){
        for(Account tempAccount : result){
            String theUpperName = tempAccount.getName().toUpperCase();
            tempAccount.setName(theUpperName);
        }
    }
    
    @Around("execution(* spring.demo.aop.service.*.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable{
        String method = theProceedingJoinPoint.getSignature().toShortString();
        myLogger.log(Level.INFO, "\n===========> Executing @Around on method: {0}", method);
        
        long begin = System.currentTimeMillis();
        
        Object result = null;
        try{
            result = theProceedingJoinPoint.proceed();
        }
        catch(Exception e){
            myLogger.warning(e.getMessage());
            result = "Major accident! But no worries, your private AOP helicopter is on the way!";
            
            //rethrow exception
            //throw e;
        }
        
        long end = System.currentTimeMillis();
        
        long duration = end - begin;
        myLogger.log(Level.INFO, "\n============> Duration: {0} seconds", duration / 1000.0);
        
        return result;
    }
    
    @AfterReturning(pointcut = "execution(* spring.demo.aop.dao.AccountDAO.findAccounts(..))", returning = "result")
    public void afterReturningFindAccountAdvice(JoinPoint theJoinPoint, List<Account> result){
        String method = theJoinPoint.getSignature().toShortString();
        myLogger.log(Level.INFO, "\n============> Executing @AfterReturning on method: {0}", method);
        myLogger.log(Level.INFO, "\n============> Result is: {0}", result);
        convertAccountNamesToUpperCase(result);
        myLogger.log(Level.INFO, "\n============> Result is: {0}", result);
    }
    
    @AfterThrowing(pointcut = "execution(* spring.demo.aop.dao.AccountDAO.findAccounts(..))", throwing = "ex")
    public void afterThrowingFindAccountAdvice(JoinPoint theJoinPoint, Throwable ex){
        String method = theJoinPoint.getSignature().toShortString();
        myLogger.log(Level.INFO, "\n============> Executing @AfterThrowing method: {0}", method);
        myLogger.log(Level.INFO, "\n============> The exception is: {0}", ex);
    }
    
    @After("execution(* spring.demo.aop.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountAdvice(JoinPoint theJoinPoint){
        String method = theJoinPoint.getSignature().toShortString();
        myLogger.log(Level.INFO, "\n============> Executing @After (finally) method: {0}", method);
    }
    
    @Before("spring.demo.aop.aspect.AopExpressions.forPackageDAONoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint){
        myLogger.info("\n========> Executing @Before advice on addAccount()");
        
        // display the method signature
        MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
        myLogger.log(Level.INFO, "Method: {0}", methodSig);
        
        // display method arguments
        Object[] args = theJoinPoint.getArgs();
        for(Object arg : args){
            myLogger.info(arg.toString());
            if(arg instanceof Account){
                Account theAccount = (Account) arg;
                myLogger.log(Level.INFO, "Account name: {0}", theAccount.getName());
                myLogger.log(Level.INFO, "Account level: {0}", theAccount.getLevel());
            }
        }
    }
}
