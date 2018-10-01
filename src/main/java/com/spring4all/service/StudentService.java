package com.spring4all.service;

import com.spring4all.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-15 08:51
 **/
@Service
public class StudentService {
//    @Autowired(required = false)
//    @Qualifier("studentDao")
//    @Autowired
//    @Resource(name="studentDao2")
    @Inject
    private StudentDao studentDao2;

    public void print(){
        System.out.println(studentDao2.getLable());
    }
}