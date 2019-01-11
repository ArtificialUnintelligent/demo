package com.artificialunintelligent.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 4:53 PM 2019/1/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AbstractInnerTest {

    @Autowired
    private ANomalService aNomalService;

    @Test
    public void test(){
        System.out.println("test");
        aNomalService.doSomeThing();
    }

}
