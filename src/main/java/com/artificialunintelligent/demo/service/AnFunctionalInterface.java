package com.artificialunintelligent.demo.service;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 2:49 PM 2019/1/4
 */
@FunctionalInterface
public interface AnFunctionalInterface {

    Integer handler(Integer i);

    default Integer defaultHandler(Integer i){
        return i + 10;
    }

}
