package com.artificialunintelligent.demo.service.impl;

import com.artificialunintelligent.demo.service.AnFunctionalInterface;
import org.springframework.stereotype.Service;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 2:49 PM 2019/1/4
 */
@Service
public class AnFunctionalInterfaceImpl implements AnFunctionalInterface{

    @Override
    public Integer handler(Integer i) {
        return i + 2;
    }
}
