package com.spring4all.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-10-01 11:13
 **/
@Component
public class Boss {

//    @Autowired
    private Car car;

//    @Autowired
//    public Boss(@Autowired Car car){
    public Boss(Car car){
        this.car = car;
        System.out.println("boss....有参构造器");
    }

    public Car getCar() {
        return car;
    }

//    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}


