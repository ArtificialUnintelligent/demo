package com.artificialunintelligent.demo.proxy;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @Author: ArtificialUnintelligent
 * @Description: 使用cglib代理
 * @Date: 6:34 PM 2018/12/24
 */
public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
        throws Throwable {
        System.out.println("工作前准备-1");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("工作后收尾-1");
        return result;
    }
}
