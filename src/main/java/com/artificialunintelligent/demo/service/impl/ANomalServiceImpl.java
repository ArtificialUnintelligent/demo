package com.artificialunintelligent.demo.service.impl;

import com.artificialunintelligent.demo.service.ANomalService;
import org.springframework.stereotype.Service;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 4:51 PM 2019/1/3
 */
@Service
public class ANomalServiceImpl implements ANomalService {

    @Override
    public void doSomeThing() {
        System.out.println("do some thing");
    }
}
