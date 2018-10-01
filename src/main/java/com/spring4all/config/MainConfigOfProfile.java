package com.spring4all.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.spring4all.pojo.Yellow;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;

/**
 * @program: spring-annotation
 * @description: profile配置类
 * @author: qiankeqin
 * @create: 2018-10-01 13:32
 **/
@PropertySource({"classpath:/db.properties"})
@Configuration
public class MainConfigOfProfile implements EmbeddedValueResolverAware{

    @Value("${db.user}")
    private String user;

    private StringValueResolver valueResolver;

    private String clazzName;


    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.valueResolver = resolver;
        clazzName = resolver.resolveStringValue("${db.className}");
    }

    @Profile("test")
    @Bean
    public Yellow yellow(){
        return new Yellow();
    }

    @Profile("default")
    @Bean("testDataSource")
    public DataSource dataSourceTest(@Value("${db.password}") String password) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");

        dataSource.setDriverClass(clazzName);
        return dataSource;
    }

    @Profile("dev")
    @Bean("devDataSource")
    public DataSource dataSourceDev(@Value("${db.password}") String password) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");

        dataSource.setDriverClass(clazzName);
        return dataSource;
    }

    @Profile("proc")
    @Bean("procDataSource")
    public DataSource dataSourceProc(@Value("${db.password}") String password) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/tale");

        dataSource.setDriverClass(clazzName);
        return dataSource;
    }
}
