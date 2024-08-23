package com.example.demo.aop;

import com.example.demo.service.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class TrackAspect {

    @Pointcut("execution(* com.example.demo.service.*.*(..))")
    private void all(){}

    @Pointcut("execution(* com.example.demo.service.*.get*(..))")
    private void geter(){}

    @Pointcut("execution(* com.example.demo.service.*.set*(..))")
    private void seter(){}

    @Pointcut("all() && !geter() && !seter()")
    private void allExceptGetterAndSetter(){}


    @Before("allExceptGetterAndSetter()")
    public void doAnyThing(JoinPoint joinPoint){

        System.out.println("this is any thingg before method add new account ");
        System.out.println(((Account)joinPoint.getArgs()[0]).getName());


    }


}

