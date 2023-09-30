package com.example.mode2.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(void add*(..))")
    public void allAddMethods() {}

    @Pointcut("execution(void get*(..))")
    public void allGetMethods() {}

    @Pointcut("execution(void return*(..))")
    public void allReturnMethods() {}
}
