package com.spring4all.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-19 20:36
 **/
public class Red implements ApplicationContextAware,BeanNameAware,EmbeddedValueResolverAware{

    //后续如果使用，这里可以进行保存该变量
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext注入："+applicationContext);
        this.applicationContext = applicationContext;
    }


    public void setBeanName(String name) {
        System.out.println("当前Bean的名称:"+name);
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String s = resolver.resolveStringValue("你好${os.name},我是#{20*18}");
        System.out.println(s);
    }
}
