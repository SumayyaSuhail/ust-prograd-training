package com.example.demoAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Helper {
    @Pointcut("execution(public void show())")
    public void pointCut(){

    }

//    @Before("pointCut()")
//    public void log(){
//        System.out.println("Before Execution");
//    }
//    @After("pointCut()")
//    public void afterLog(){
//        System.out.println("After Execution");
//    }
    @Around("pointCut()")
    public void aroundLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("before");
        proceedingJoinPoint.proceed();
        System.out.println("after");
    }

//    @AfterReturning
//    @AfterThrowing
}
