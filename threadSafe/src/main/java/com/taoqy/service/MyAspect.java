package com.taoqy.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author Taoqy
 * @version 1.0, 2020/7/14
 * @see [相关类/方法]
 * @since bapfopm-pfpsmas-cbfsms-service 1.0
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.taoqy.service.ServiceA.*(..)) ||"+
            "execution(* com.taoqy.service.ServiceB.*(..))")
    public void matchCondition(){}


    @Before("matchCondition()")
    public void beforce(){
        System.out.println("执行方法前");
    }
}
