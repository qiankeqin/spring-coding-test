package com.spring4all.test;

import com.spring4all.life.MainConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-20 20:15
 **/
public class LifeCycle_IOCTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        System.out.println("容器创建完成");

        annotationConfigApplicationContext.close();
    }

    @Test
    public void test(){
        //1.创建IOC容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        System.out.println("容器创建完成");
    }
}
