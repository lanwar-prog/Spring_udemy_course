package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetBookAdvice: try getting the book/magazine");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: Verification of eligibility the book/magazine");
    }

//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeGetBookAdvice: try return the book");
//    }
}
