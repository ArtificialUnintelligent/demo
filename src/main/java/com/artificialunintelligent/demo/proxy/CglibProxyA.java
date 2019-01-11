package com.artificialunintelligent.demo.proxy;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @Author: ArtificialUnintelligent
 * @Description: 第二个拦截器
 * @Date: 2:47 PM 2019/1/3
 */
public class CglibProxyA implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
        throws Throwable {
        System.out.println("工作前准备-2");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("工作后收尾-2");
        return result;
    }

}
