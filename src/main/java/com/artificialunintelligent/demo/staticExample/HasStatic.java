package com.artificialunintelligent.demo.staticExample;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 11:42 PM 2019/2/26
 */
public class HasStatic {

    private static int i = 100;

    public static void main(String[] args) {
        HasStatic h1 = new HasStatic();
        h1.i++;
        HasStatic h2 = new HasStatic();
        h2.i++;
        h1 = new HasStatic();
        h1.i++;
        HasStatic.i--;

        System.out.println(i);
    }

}
