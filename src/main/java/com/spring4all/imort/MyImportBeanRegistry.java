package com.spring4all.imort;

import com.spring4all.pojo.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-19 20:48
 **/
public class MyImportBeanRegistry implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param importingClassMetadata 当前类的注解信息
     * @param registry BeanDefinition注册类
     *                 把所有需要添加到容器中
     *
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if(registry.containsBeanDefinition("com.spring4all.pojo.Red")){
            //指定bean定义信息，包括bean的scope等等
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //指定bean名称，并注册到容器中
            registry.registerBeanDefinition("rainBow",beanDefinition);
        }
    }
}
