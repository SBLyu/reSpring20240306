package com.sblyu.reSpring20240306;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class MyAspect {

//    @Before("execution(* com.sblyu.reSpring20240306.HpPrinter.*(..))")
//    private void before(){
//        System.out.println("I'm before.");
//    }
//
//    @After("execution(* com.sblyu.reSpring20240306.HpPrinter.*(..))")
//    private void after(){
//        System.out.println("I'm after.");
//    }

    @Around("execution(* com.sblyu.reSpring20240306.HpPrinter.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Date start =new Date();

        Object obj=pjp.proceed();

        Date end =new Date();
        long time=end.getTime()-start.getTime();
        System.out.println("總執行時間: "+time+" ms.");
        return obj;
    }
}
