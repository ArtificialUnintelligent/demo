package com.artificialunintelligent.demo.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 11:05 AM 2019/3/31
 */
public class ExtendThreadPoolDemo {

    static class ExtendThreadPool implements Runnable{

        String name;

        public ExtendThreadPool(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out
                .println("正在执行：Thread ID:" + Thread.currentThread().getId() + ", Task Name = " + name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /**
         * 扩展线程池，重写 beforeExecute, afterExecute, terminated 方法，这三个方法默认是空的。
         * 可以监控每个线程任务执行的开始和结束时间，或者自定义一些增强。
         * 在 Worker 的 runWork 方法中，会调用这些方法
         */
        ExecutorService e = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque<>()){
            @Override
            protected void beforeExecute(Thread t, Runnable r) {
                System.out.println("准备执行：" + ((ExtendThreadPool) r).name);
            }

            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.println("执行完成： " + ((ExtendThreadPool) r).name);
            }

            @Override
            protected void terminated() {
                System.out.println("线程池退出");
            }
        };
        for (int i = 0; i < 4; i++) {
            ExtendThreadPool extendThreadPool = new ExtendThreadPool("TASK-GEYM-" + i);
            e.execute(extendThreadPool);
            Thread.sleep(10);
        }
        e.shutdown();
    }

}
