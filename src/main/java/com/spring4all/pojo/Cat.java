package com.spring4all.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-20 20:28
 **/
@Component
public class Cat implements InitializingBean,DisposableBean{

    public Cat(){
        System.out.println("Cat constructor...");
    }

    public void destroy() throws Exception {
        System.out.println("Cat destroy...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat afterPropertiesSet...");
    }
}
