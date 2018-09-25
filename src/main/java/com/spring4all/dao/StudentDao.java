package com.spring4all.dao;

import org.springframework.stereotype.Component;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-15 08:51
 **/
//@Component
public class StudentDao {
    private String lable ;

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}
