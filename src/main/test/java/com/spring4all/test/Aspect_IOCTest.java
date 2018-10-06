package com.spring4all.test;

import com.spring4all.aop.MathCalculator;
import com.spring4all.config.MainConfigOfAop;
import com.spring4all.config.MainConfigOfAutowired;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-10-03 00:05
 **/
public class Aspect_IOCTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAop.class);
        MathCalculator bean = applicationContext.getBean(MathCalculator.class);
        bean.div(1,1);
    }
}
