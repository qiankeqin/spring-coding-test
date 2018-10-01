package com.spring4all.pojo;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-19 20:27
 **/
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
