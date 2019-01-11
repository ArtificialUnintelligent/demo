package com.artificialunintelligent.demo.methodHandle;


import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: ArtificialUnintelligent
 * @Description: 使用MethodHandles将方法作为参数传递
 * @Date: 4:47 PM 2019/1/10
 */
public class MethodHandleTest {

    public static void main(String[] args) throws Throwable{
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = lookup.findStatic(MethodHandleTest.class, "doubleVal",
            MethodType.methodType(Integer.class, int.class, int.class));
        List<Integer> dataList = Arrays.asList(1, 2, 3, 4, 5);
        MethodHandleTest.transform(dataList, methodHandle);
        for (Integer data : dataList){
            System.out.println(data);
        }
    }

    private static void transform(List<Integer> dataList, MethodHandle handle) throws Throwable {
        for (int i = 0; i < dataList.size(); i++) {
            dataList.set(i, (Integer) handle.invoke(dataList.get(i), 2));//invoke
        }
    }

    private static Integer doubleVal(int val, int val1) {
        return val * 2 + val1;
    }

}
