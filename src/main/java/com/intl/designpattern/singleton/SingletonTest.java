package com.intl.designpattern.singleton;


/**
 * designpattern
 * jdk动态代理测试
 * @author intlgj
 * @create 2018/8/26
 **/
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singletion = Singleton.getInstance();
        Singleton2 singletion2 = Singleton2.getInstance();
        Singleton2 singletion3 = Singleton2.getInstance();
        System.out.println("hello singleton2333588 ");
    }
}
