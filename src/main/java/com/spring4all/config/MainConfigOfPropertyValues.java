package com.spring4all.config;

import com.spring4all.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-22 15:53
 **/
@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Student student(){
        return new Student();
    }
}
