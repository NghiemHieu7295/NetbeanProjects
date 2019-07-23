
package spring.demo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    
    @Pointcut("execution(* spring.demo.aop.dao.*.*(..))")
    public void forPackageDAO(){}    
    
    @Pointcut("execution(* spring.demo.aop.dao.*.get*(..))")
    public void getter(){}
    
    @Pointcut("execution(* spring.demo.aop.dao.*.set*(..))")
    public void setter(){}
    
    @Pointcut("forPackageDAO() && !(getter() || setter())")
    public void forPackageDAONoGetterSetter(){}
}
