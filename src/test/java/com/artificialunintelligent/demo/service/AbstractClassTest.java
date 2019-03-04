package com.artificialunintelligent.demo.service;

import com.artificialunintelligent.demo.service.impl.AbstractClass;
import com.artificialunintelligent.demo.service.impl.AnRealizeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 9:47 AM 2019/3/4
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbstractClassTest {

    @Autowired
    AbstractClass abstractClass;

    @Autowired
    AnRealizeClass realizeClass;

    @Test
    public void test(){
        abstractClass.print();
        realizeClass.abstractPrint();
    }
}
