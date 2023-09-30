package com.example.mode2.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAroundAspect {
    @Around("com.example.mode2.aspects.MyPointcuts.allAddMethods() || com.example.mode2.aspects.MyPointcuts.allGetMethods() || com.example.mode2.aspects.MyPointcuts.allReturnMethods()")
    public Object aroundGetLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
            System.out.println("aroundGetLoggingAdvice: метод успешно выполнен");
            System.out.println("-----------------------------------");
        }
        catch (Exception e) {
            System.out.println("aroundGetLoggingAdvice: было поймано исключение: " + e);
        }

        return targetMethodResult;
    }
}
