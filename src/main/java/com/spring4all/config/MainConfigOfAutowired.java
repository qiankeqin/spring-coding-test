package com.spring4all.config;

import com.spring4all.dao.StudentDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean("studentDao2")
    public StudentDao studentDao2(){
        StudentDao dao =  new StudentDao();
        dao.setLable("hello2");
        return dao;
    }

    @Primary
    @Bean("studentDao")
    public StudentDao studentDao(){
        StudentDao dao =  new StudentDao();
        dao.setLable("hello");
        return dao;
    }
}
