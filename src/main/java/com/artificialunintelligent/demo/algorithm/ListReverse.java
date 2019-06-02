package com.artificialunintelligent.demo.algorithm;

import java.util.Objects;

/**
 * @author:artificialunintelligent
 * @Desc:经典的字符串反转示例
 * @Date:2019-06-02
 * @Time:14:31
 */
public class ListReverse {

    public static void main(String[] args) {
        String r = reverse("123456");
        System.out.println(r);
    }

    public static String reverse(String s){
        if (Objects.isNull(s) || s.length() <= 1){
            return s;
        }
        String _s = s.substring(1);
        char _c = s.charAt(0);
        String rs = reverse(_s);
        String r = rs + _c;
        return r;
    }
}
