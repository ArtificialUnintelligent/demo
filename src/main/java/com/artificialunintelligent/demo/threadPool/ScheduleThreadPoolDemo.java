package com.artificialunintelligent.demo.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 5:03 PM 2019/3/29
 */
public class ScheduleThreadPoolDemo {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor service4 = (ScheduledThreadPoolExecutor) Executors
            .newScheduledThreadPool(2);

        // 如果前面的任务没有完成，则调度也不会启动
        // initialDelay（初始延迟） 表示第一次延时时间 ; period 表示间隔时间
        service4.scheduleAtFixedRate(() -> {
            try {
                // 如果任务执行时间大于间隔时间，那么就以执行时间为准（防止任务出现堆叠）。
                Thread.sleep(10000);
                System.out.println(System.currentTimeMillis() / 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 0, 2, TimeUnit.SECONDS);

        // initialDelay（初始延迟） 表示延时时间；delay + 任务执行时间 = 间隔时间 period
        service4.scheduleWithFixedDelay(() -> {
            try {
                Thread.sleep(5000);
                System.out.println(System.currentTimeMillis() / 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 0, 2, TimeUnit.SECONDS);

        // 在给定时间，对任务进行一次调度
        service4.schedule(() -> System.out.println("5 秒之后执行 schedule"), 5, TimeUnit.SECONDS);
    }

}
