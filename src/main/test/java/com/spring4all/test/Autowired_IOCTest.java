package com.spring4all.test;

import com.spring4all.config.MainConfigOfAutowired;
import com.spring4all.dao.StudentDao;
import com.spring4all.pojo.Boss;
import com.spring4all.pojo.Car;
import com.spring4all.pojo.Color;
import com.spring4all.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-23 11:48
 **/
public class Autowired_IOCTest {


    @Test
    public void test2(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        Color color = (Color) annotationConfigApplicationContext.getBean("color2");
        System.out.println(color);
        Car car = annotationConfigApplicationContext.getBean(Car.class);
        System.out.println(car);
    }


    @Test
    public void test1(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        Boss boss = annotationConfigApplicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = annotationConfigApplicationContext.getBean(Car.class);
        System.out.println(car);
    }


    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        StudentService bean = annotationConfigApplicationContext.getBean(StudentService.class);
        bean.print();
//
//        StudentDao bean1 = annotationConfigApplicationContext.getBean(StudentDao.class);
//        System.out.println(bean1);


//        annotationConfigApplicationContext.close();

    }
}
