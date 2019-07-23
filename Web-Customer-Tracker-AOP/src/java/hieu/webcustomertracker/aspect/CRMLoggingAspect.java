
package hieu.webcustomertracker.aspect;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
    
    private Logger myLogger = Logger.getLogger(getClass().getName());
    
    @Pointcut("execution(* hieu.webcustomertracker.controller.*.*(..))")
    private void forControllerPackage(){}
    
    @Pointcut("execution(* hieu.webcustomertracker.service.*.*(..))")
    private void forServicePackage(){}
    
    @Pointcut("execution(* hieu.webcustomertracker.dao.*.*(..))")
    private void forDAOPackage(){}
    
    @Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
    private void forAppFlow(){}
    
    @Before("forAppFlow()")
    public void before(JoinPoint theJoinPoint){
        String method = theJoinPoint.getSignature().toShortString();
        myLogger.info("\n------------------------");
        myLogger.log(Level.INFO, "\n=====> in @Before: calling method: {0}", method);
        myLogger.info("\n------------------------");
        
        Object[] args = theJoinPoint.getArgs();
        for(Object tempArg : args){
            myLogger.log(Level.INFO, "=====> argument: {0}", tempArg);
        }
    }
    
    @AfterReturning(pointcut = "forAppFlow()", returning = "theResult")
    public void afterReturning(JoinPoint theJoinPoint, Object theResult){
        String method = theJoinPoint.getSignature().toShortString();
        myLogger.info("\n------------------------");
        myLogger.log(Level.INFO, "\n=====> in @Before: calling method: {0}", method);
        myLogger.info("\n------------------------");
        
        myLogger.log(Level.INFO, "\n=====> result: {0}", theResult);
    }
}
