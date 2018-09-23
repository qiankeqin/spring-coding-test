package com.spring4all.pojo;

import com.spring4all.dao.StudentDao;
import org.springframework.context.annotation.*;

/**
 * @program: spring-annotation
 * @description: Student配置类
 * @author: qiankeqin
 * @create: 2018-09-15 00:08
 **/
//配置类==配置文件
@Configuration   //告诉Spring这是一个配置类，相当于这是一个配置文件
@ComponentScan(value = "com.spring4all",
        excludeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {
//                        Controller.class
//                }),
                @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes = {
                        StudentDao.class
                }),
                @ComponentScan.Filter(type=FilterType.CUSTOM,classes = {
                        MyTypeFilter.class
                })
        }
)
public class StudentConfig {

    /**
     * 给容器中注册一个Bean
     * Bean类型为返回值类型，id默认使用方法名
     *
     * @return
     */
    @Scope
    @Bean
    public Student student() {
        System.out.println("给容器中添加Student。。。");
        return new Student("lisi", "zhejiang wenzhou");
    }

}
