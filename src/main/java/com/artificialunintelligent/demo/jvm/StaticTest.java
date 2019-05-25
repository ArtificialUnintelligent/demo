package com.artificialunintelligent.demo.jvm;

/**
 * @author:artificialunintelligent
 * @Date:2019-05-23
 * @Time:00:24
 */
public class StaticTest {

    int a = 110;

    static int b = 112;

    public static void main(String[] args) {
        staticMethod();
    }

    static StaticTest staticTest = new StaticTest();

    static {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    public StaticTest() {
        System.out.println(3);
        System.out.println("a = " + a + ";b=" + b);
    }

    public static void staticMethod(){
        System.out.println(4);
    }

}
