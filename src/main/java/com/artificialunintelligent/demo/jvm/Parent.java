package com.artificialunintelligent.demo.jvm;

/**
 * @author:artificialunintelligent
 * @Date:2019-05-23
 * @Time:00:07
 */
public class Parent {

    int i = 1;

    {i = 2;}

    public Parent() {
        System.out.println(i);
        int x = getValue();
        System.out.println(x);
    }

    protected int getValue(){
        return i;
    }
}
