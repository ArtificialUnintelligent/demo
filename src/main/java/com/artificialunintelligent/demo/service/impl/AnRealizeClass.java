package com.artificialunintelligent.demo.service.impl;

import com.artificialunintelligent.demo.service.AnFunctionalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 9:45 AM 2019/3/4
 */
@Service
public class AnRealizeClass extends AbstractClass{

    @Autowired
    AnFunctionalInterface anFunctionalInterface;

    @Override
    public void abstractPrint() {
        int i = anFunctionalInterface.handler(1);
        System.out.println(i);
    }
}
