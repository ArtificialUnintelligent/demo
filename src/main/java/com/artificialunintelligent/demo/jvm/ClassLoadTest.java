package com.artificialunintelligent.demo.jvm;

/**
 * @author:artificialunintelligent
 * @Date:2019-05-23
 * @Time:00:07
 */
public class ClassLoadTest {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getValue());
    }
}
