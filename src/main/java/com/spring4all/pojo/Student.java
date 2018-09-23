package com.spring4all.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-14 23:58
 **/
public class Student {
    @Value("hangzhou")
    private String name;
    @Value("zhejiang")
    private String address;
    @Value("#{2 + 4}")
    private Integer age;
    @Value("${nickname}")
    private String nickName;


    public Student() {
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name, String address,Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
