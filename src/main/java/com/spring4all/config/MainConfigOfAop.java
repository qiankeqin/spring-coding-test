package com.spring4all.config;

import com.spring4all.aop.LogAspect;
import com.spring4all.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-10-02 23:27
 **/
@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAop {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
