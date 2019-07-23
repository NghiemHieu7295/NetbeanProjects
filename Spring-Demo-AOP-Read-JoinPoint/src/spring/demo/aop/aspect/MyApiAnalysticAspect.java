
package spring.demo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalysticAspect {
    
    @Before("spring.demo.aop.aspect.AopExpressions.forPackageDAONoGetterSetter()")
    public void performApiAnalystic(){
        System.out.println("========> Performing API analystics");
    }
}
