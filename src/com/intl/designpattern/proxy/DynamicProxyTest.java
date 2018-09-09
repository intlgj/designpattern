package com.intl.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * designpattern
 * jdk动态代理测试
 * @author intlgj
 * @create 2018/8/26
 **/
public class DynamicProxyTest {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler invocationHandler = new MyInvocationHandler<Subject>(subject);
        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Subject subProxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class<?>[]{Subject.class}, invocationHandler);
        subProxy.visit();


    }
}
