package com.artificialunintelligent.demo.service;

import com.artificialunintelligent.demo.ArtificialUnintelligentApplicationTests;
import com.artificialunintelligent.demo.domain.User;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 2:44 PM 2019/1/4
 */
public class FuncationalInterfaceTest extends ArtificialUnintelligentApplicationTests{

    @Autowired
    AnFunctionalInterface anFunctionalInterface;

    @Test
    public void handleTest() {
        System.out.println(anFunctionalInterface.handler(1));
        System.out.println(anFunctionalInterface.defaultHandler(10));
    }

    @Test
    public void fTest(){
        User user = new User("a1", "张三", 18);
        Supplier<String> sup = user::getName;
        System.out.println(sup.get());

        BiPredicate<String, String> bp = String::equals;
        System.out.println(bp.test("aaa", "aaa"));

        Function<User, String> f = User::getName;
        System.out.println(f.apply(user));
    }

    @Test
    public void streamTest(){
        //1.可以通过Collection 系列集合提供的stream()或parallelStream()
        List<String> l = new ArrayList<>();
        Stream<String> stream = l.stream();
        //2.通过 Arrays 中的静态方法stream()获取数组流
        User[] users = new User[10];
        Stream<User> userStream = Arrays.stream(users);
        //3.通过Stream 类中的静态方法of
        Stream<String> stringStream = Stream.of("aaa", "bb", "c");
        //4.创建无限流
        Stream<Integer> integerStream = Stream.iterate(0, (x) -> x+2);
        integerStream.limit(10).forEach(System.out::println);

        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        //映射
        List<User> us = Arrays.asList(new User("1", "aa", 19), new User("2", "bb", 20),
            new User("3", "cc", 21), new User("4", "cc", 22), new User("5", "dd", 22));
        us.stream().filter( user -> user.getAge() > 19).skip(2).limit(10).distinct().forEach(System.out::println);

        List<String> l1 = Arrays.asList("aaa", "bbb", "1111");
        l1.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    @Test
    public void consumerTest(){
        Consumer c = System.out::println;
        Consumer c1 = n -> System.out.println(n + "aaaa");
        c.andThen(c1).accept("test");
    }

    @Test
    public void functionTest(){
        Function<Integer, Integer> f = s -> s + 10;
        Function<Integer, Integer> g = s -> s * 2;

        /*
         * 下面表示在执行F时，先执行G，并且执行F时使用G的输出当作输入。
         * 相当于以下代码：
         * Integer a = g.apply(1);
         * System.out.println(f.apply(a));
         */
        System.out.println(f.compose(g).apply(1));

        /*
         * 表示执行F的Apply后使用其返回的值当作输入再执行G的Apply；
         * 相当于以下代码
         * Integer a = f.apply(1);
         * System.out.println(g.apply(a));
         */
        System.out.println(f.andThen(g).apply(1));

        /*
         * identity方法会返回一个不进行任何处理的Function，即输出与输入值相等；
         */
        System.out.println(Function.identity().apply("a"));
    }

}
