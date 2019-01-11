package com.artificialunintelligent.demo.proxy;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.CallbackFilter;

/**
 * @Author: ArtificialUnintelligent
 * @Description: 回调过滤器
 * @Date: 2:49 PM 2019/1/3
 */
public class CglibFilter implements CallbackFilter {

    @Override
    public int accept(Method method) {
        System.out.println("回调过滤器触发");
        if(method.getName().equals("toString") || method.getName().equals("doWork")) {
            return 1;
        }
        return 0;
    }
}
