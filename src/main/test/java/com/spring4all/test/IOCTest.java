package com.spring4all.test;

import com.spring4all.pojo.Student;
import com.spring4all.pojo.StudentConfig;
import com.spring4all.scope.Main2Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-15 08:56
 **/
public class IOCTest {

    @Test
    public void test04(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main2Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String item : beanDefinitionNames){
            System.out.println(item);
        }
    }

    @Test
    public void test03(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main2Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String item : beanDefinitionNames){
            System.out.println(item);
        }
        //获取操作系统的名称
        Environment environment =  applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        Map<String, Student> bean = applicationContext.getBeansOfType(Student.class);
        System.out.println(bean);
    }

    @Test
    public void test02(){
        //获取容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main2Config.class);
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for(String bean:beanDefinitionNames){
//            System.out.println(bean);
//        }

        Object student = applicationContext.getBean("student");
//        Object student1 = applicationContext.getBean("student");
//        System.out.println(student==student1);


    }


    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StudentConfig.class);
        //查看容器中有哪些Bean
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String item : beanDefinitionNames){
            System.out.println(item);
        }
    }

}
