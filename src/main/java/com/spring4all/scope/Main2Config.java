package com.spring4all.scope;

import com.spring4all.conditional.MacOsCondition;
import com.spring4all.conditional.WindowCondition;
import com.spring4all.factoryBean.ColorFactoryBean;
import com.spring4all.imort.MyImportBeanRegistry;
import com.spring4all.imort.MyImportSelector;
import com.spring4all.pojo.Color;
import com.spring4all.pojo.Red;
import com.spring4all.pojo.Student;
import org.springframework.context.annotation.*;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-15 13:50
 **/
@Configuration
@Import({Color.class,Red.class,MyImportSelector.class, MyImportBeanRegistry.class})
public class Main2Config {

//    @Scope(value=SCOPE_PROTOTYPE)
    @Lazy
    @Bean
    public Student student(){
        System.out.println("容器中添加了一个Student");
        return new Student("wangwu","hangzhou lingan");
    }

    /**
     * 如果是Mac，那么注册mac，如果系统是window，那么注册bill
     *
     */

    @Conditional(value={WindowCondition.class})
    @Bean("bill")
    public Student student2(){
        System.out.println("容器中添加了一个Student1");
        return new Student("hello","world");
    }

    @Conditional(value={MacOsCondition.class})
    @Bean("mac")
    public Student Student3(){
        return new Student("mac","zhejiang");
    }


    //使用FactoryBean
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
