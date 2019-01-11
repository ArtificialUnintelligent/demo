package com.artificialunintelligent.demo.proxy;

/**
 * @Author: ArtificialUnintelligent
 * @Description: 一个普普通通的工作者类
 * @Date: 4:53 PM 2018/12/24
 */
public class WorkerImpl implements Worker {

    private AnotherWorker worker = new AnotherWorker();

    @Override
    public void doWork() {
        System.out.println("干活儿");
    }

    public AnotherWorker getWorker() {
        return worker;
    }

    public void setWorker(AnotherWorker worker) {
        this.worker = worker;
    }

    public static void main(String[] args) {
        WorkerImpl worker = new WorkerImpl();
        AnotherWorker aw = worker.getWorker();

        WorkerImpl worker1 = new WorkerImpl();
        AnotherWorker aw1 = worker1.getWorker();

        System.out.println(aw);
    }
}
