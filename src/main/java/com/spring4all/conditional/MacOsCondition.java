package com.spring4all.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: spring-annotation
 * @description: mac condition
 * @author: qiankeqin
 * @create: 2018-09-19 20:03
 **/
public class MacOsCondition implements Condition {
    /**
     * ConditionContext ：判断条件能使用的上下文（环境）
     * AnnotatedTypeMetadata：注释信息
     * @param context
     * @param metadata
     * @return
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //是否是linux
        //1。能获取到ioc使用到beanfactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //2。获取类加载起
        ClassLoader beanClassLoader = context.getClassLoader();
        //3。获取环境
        Environment environment = context.getEnvironment();
        //4.获取到bean定义到注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        String property = environment.getProperty("os.name");
        if(property.contains("Mac")){
            return true;
        }

        return false;
    }
}
