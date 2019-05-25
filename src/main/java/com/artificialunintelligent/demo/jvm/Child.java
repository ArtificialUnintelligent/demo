package com.artificialunintelligent.demo.jvm;

/**
 * @author:artificialunintelligent
 * @Date:2019-05-23
 * @Time:00:07
 */
public class Child extends Parent {

    int j = 1;

    public Child() {
        j = 2;
    }

    {j = 3;}

    @Override
    protected int getValue() {
        return j;
    }
}
