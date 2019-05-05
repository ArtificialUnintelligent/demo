package com.artificialunintelligent.demo.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 10:57 AM 2019/3/29
 */
public class ThreadPoolDemo {

    public Demo1 getDemo(){
        return new Demo1();
    }

    class Demo1 implements Runnable{
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis() + " thread id ->" + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadPoolDemo threadPoolDemo = new ThreadPoolDemo();
        Demo1 demo1 = threadPoolDemo.getDemo();
        ExecutorService executorService = new ThreadPoolExecutor(5, 20, 0L,
            TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque<>(1024),
            Executors.defaultThreadFactory(),
            new AbortPolicy());
        for (int i = 0; i < 10; i++){
            executorService.submit(demo1);
        }
        executorService.shutdown();
    }

}
