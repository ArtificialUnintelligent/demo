package com.artificialunintelligent.demo.proxy;

import com.artificialunintelligent.demo.ArtificialUnintelligentApplicationTests;
import java.io.FileOutputStream;
import org.junit.Test;
import org.springframework.cglib.core.GeneratorStrategy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import sun.misc.ProxyGenerator;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 5:31 PM 2018/12/24
 */
public class WorkTest extends ArtificialUnintelligentApplicationTests{

    @Test
    public void workTest(){
        //直接调用
        Worker w = new WorkerImpl();
        //静态代理
        Worker worker1 = new WorkProxy(w);
        worker1.doWork();

        //动态代理
        DynamicProxy dynamicProxy = new DynamicProxy();
        Worker worker2 = (Worker) dynamicProxy.getProxy(w);
        worker2.doWork();
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", WorkerImpl.class.getInterfaces());
        String path = "./WorkerProxy.class";
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(classFile);
            fos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }

        //cglib代理
        OtherWorker ow = new OtherWorker();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ow.getClass());
//        Callback[] callbacks = new Callback[2];
//        callbacks[0] = new CglibProxy();
//        callbacks[1] = new CglibProxyA();
//        enhancer.setCallbacks(callbacks);
        enhancer.setCallback(new CglibProxy());
//        enhancer.setCallbackFilter(new CglibFilter());
//        enhancer.setNamingPolicy();
//        enhancer.getStrategy();
        OtherWorker wp = (OtherWorker) enhancer.create();
        wp.doWork();
        System.out.println(wp.toString());

        try {
            GeneratorStrategy strategy = enhancer.getStrategy();
            byte[] cf = strategy.generate(enhancer);
            String p = "./OtherWorkerProxy.class";
            try {
                FileOutputStream fos = new FileOutputStream(p);
                fos.write(cf);
                fos.flush();
            }catch (Exception e){
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        //随便写的一个方法，用来查看反射机制拿到的接口名
//        try {
//            Class<?> c1 =  Class.forName("com.artificialunintelligent.demo.proxy.Worker", false, w.getClass().getClassLoader());
//            System.out.println(c1.getName());
//            Class<?>[] cs =  w.getClass().getInterfaces();
//            for (Class<?> c : cs){
//                System.out.println(c.getName());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }


}
