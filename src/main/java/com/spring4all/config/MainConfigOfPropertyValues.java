package com.spring4all.config;

import com.spring4all.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-22 15:53
 **/
//使用@PropertySource读取外部配置文件的k/v保存到运行的环境变量中
@PropertySource(value={"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Student student(){
        return new Student();
    }
}
