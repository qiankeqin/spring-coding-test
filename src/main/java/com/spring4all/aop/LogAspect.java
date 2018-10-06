package com.spring4all.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-10-02 23:28
 **/
@Aspect
public class LogAspect {

    @Pointcut("execution(public int com.spring4all.aop.MathCalculator.*(..))")
    public void pointcut(){}

    //Before在目标方法之前切入
//    @Before("public void com.spring4all.aop.MathCalculator.div(int,int)")
//    @Before("public int com.spring4all.aop.MathCalculator.*(..)")
    @Before("pointcut()")
    public void startLog(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("除法"+joinPoint.getSignature().getName()+"运行，参数列表:"+ Arrays.toString(args));
    }

//    @After("public int com.spring4all.aop.MathCalculator.*(..)")
    @After("pointcut()")
    public void endLog(){
        System.out.println("除法运行，参数列表:{}");
    }

    @AfterReturning(value="pointcut()",returning = "result")
    public void logReturn(Object result){
        System.out.println("除法返回,运行结果:"+result.toString());
    }

    @AfterThrowing(value="pointcut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("除法异常，异常信息:{}");
    }
}
