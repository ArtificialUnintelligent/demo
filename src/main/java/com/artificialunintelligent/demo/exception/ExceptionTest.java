package com.artificialunintelligent.demo.exception;

/**
 * @author:artificialunintelligent
 * @Desc:异常执行顺序测试
 * @Date:2019-06-02
 * @Time:21:40
 */
public class ExceptionTest {

    public static void main(String[] args) {
        String r = exceptionProducer();
        System.out.println(r + "_r");
    }

    public static String exceptionProducer(){
        String s = "aa";
        try {
            System.out.println("return");
            return s;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            s = "cc";
            System.out.println("finally");
            return "bb";
        }
    }
}
