package com.spring4all.factoryBean;

import com.spring4all.pojo.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @program: spring-annotation
 * @description: 创建一个Spring定义的FactoryBean
 * @author: qiankeqin
 * @create: 2018-09-20 13:15
 **/
public class ColorFactoryBean implements FactoryBean<Color>{

    //返回一个Color对象，这个对象会添加到容器中
    public Color getObject() throws Exception {
        return new Color();
    }

    //返回类型
    public Class<?> getObjectType() {
        return Color.class;
    }

    //是否是单实例
    //true：单实例，容器中只有一份
    //false：每次调用getObject，都会注册一份
    public boolean isSingleton() {
        return false;
    }
}
