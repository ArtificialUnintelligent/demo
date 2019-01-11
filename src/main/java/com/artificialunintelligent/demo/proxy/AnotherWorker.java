package com.artificialunintelligent.demo.proxy;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 4:55 PM 2019/1/2
 */
public class AnotherWorker {

    private double i;

    public AnotherWorker() {
        i = Math.random();
    }

    public void doWork() {
        System.out.println("父类干活儿");
    }

    public void doWorkA() {
        System.out.println("父类干活儿A");
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }
}
