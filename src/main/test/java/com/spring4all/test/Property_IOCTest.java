package com.spring4all.test;

import com.spring4all.config.MainConfigOfPropertyValues;
import com.spring4all.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-22 15:54
 **/
public class Property_IOCTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }

        Student student = applicationContext.getBean(Student.class);
        System.out.println(student.getName()+","+student.getAddress());
    }
}
