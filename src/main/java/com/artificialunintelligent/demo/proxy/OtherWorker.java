package com.artificialunintelligent.demo.proxy;

/**
 * @Author: ArtificialUnintelligent
 * @Description: 另一个工作者类，此类的最大特点是没有实现接口
 * @Date: 3:52 PM 2019/1/2
 */
public class OtherWorker {

    public void doWork() {
        System.out.println("干活儿");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
