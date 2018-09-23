package com.spring4all.test;

import com.spring4all.config.MainConfigOfAutowired;
import com.spring4all.dao.StudentDao;
import com.spring4all.service.StudentService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-23 11:48
 **/
public class Autowired_IOCTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        StudentService bean = annotationConfigApplicationContext.getBean(StudentService.class);
        System.out.println(bean);
        bean.print();

        StudentDao bean1 = annotationConfigApplicationContext.getBean(StudentDao.class);
        System.out.println(bean1);


        annotationConfigApplicationContext.close();

    }
}
