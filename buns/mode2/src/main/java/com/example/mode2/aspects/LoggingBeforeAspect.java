package com.example.mode2.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingBeforeAspect {
    @Before("com.example.mode2.aspects.MyPointcuts.allAddMethods() || com.example.mode2.aspects.MyPointcuts.allGetMethods() || com.example.mode2.aspects.MyPointcuts.allReturnMethods()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("beforeGetLoggingAdvice: логирование");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
    }
}
