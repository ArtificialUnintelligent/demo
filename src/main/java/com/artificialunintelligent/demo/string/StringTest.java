package com.artificialunintelligent.demo.string;

/**
 * @author:artificialunintelligent
 * @Date:2019-05-30
 * @Time:00:29
 */
public class StringTest {

    public static void main(String[] args) {
        String a = "programming";
        String b = new String("programming");
        b.intern();
        String c = "program" + "ming";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.intern() == b.intern());
    }
}
