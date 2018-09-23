package com.spring4all.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-annotation
 * @description: 自动装配：
 *                  Spring利用DI依赖注入，完成对IOC容器中各个组件的依赖关系赋值
 * @author: qiankeqin
 * @create: 2018-09-23 10:50
 **/
@Configuration
@ComponentScan(value={"com.spring4all.dao","com.spring4all.service"})
public class MainConfigOfAutowired {
}
