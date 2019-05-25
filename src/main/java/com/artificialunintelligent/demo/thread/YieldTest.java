package com.artificialunintelligent.demo.thread;

import java.util.stream.IntStream;

/**
 * @author:artificialunintelligent
 * @Date:2019-05-25
 * @Time:12:56
 */
public class YieldTest {

    public static void main(String[] args) {
        IntStream.range(0, 2).mapToObj(YieldTest::create).forEach(Thread::start);
    }

    private static Thread create(int index){
        return new Thread(() -> {
            if (index == 0)
                Thread.yield();
            System.out.println(index);
        });
    }
}
