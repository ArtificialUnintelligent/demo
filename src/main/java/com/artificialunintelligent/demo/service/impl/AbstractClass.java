package com.artificialunintelligent.demo.service.impl;

import com.artificialunintelligent.demo.service.ANomalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 9:43 AM 2019/3/4
 */
//@Service
public abstract class AbstractClass {

    @Autowired
    ANomalService aNomalService;

    public abstract void abstractPrint();

    public void print(){
        aNomalService.doSomeThing();
    }
}
