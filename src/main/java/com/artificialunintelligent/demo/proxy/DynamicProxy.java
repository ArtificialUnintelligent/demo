package com.artificialunintelligent.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: ArtificialUnintelligent
 * @Description: 动态代理
 * @Date: 5:53 PM 2018/12/24
 */
public class DynamicProxy implements InvocationHandler{

    private Object object;//业务实现类对象

    /**
     * 通过反射机制创建代理类对象
     * @param object
     * @return
     */
    Object getProxy(Object object) {
        this.object = object;
        //三个参数分别是业务类的类加载器，业务类实现的接口，代理类
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("工作前准备");
        Object result = method.invoke(object, args);
        System.out.println("工作后收尾");
        return result;
    }
}
