package com.artificialunintelligent.demo.proxy;

/**
 * @Author: ArtificialUnintelligent
 * @Description: 静态代理类
 * @Date: 5:31 PM 2018/12/24
 */
public class WorkProxy implements Worker{

    private Worker worker;

    public WorkProxy(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void doWork() {
        System.out.println("干活儿前的准备工作");
        worker.doWork();
        System.out.println("干活儿后的收尾工作");
    }
}
