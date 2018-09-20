package com.spring4all.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-20 20:42
 **/
@Component
public class Dog {

    public Dog() {
        System.out.println("dog constructor...");
    }

    /**
     * 对象初始化并赋值后调用
     */
    @PostConstruct
    public void inti(){
        System.out.println("dog >>> postConstruct");
    }

    /**
     * 容器销毁对象时调用
     */
    @PreDestroy
    public void destroy(){
        System.out.println("dog >>> preDestroy");
    }
}
