package com.intl.designpattern.proxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * designpattern
 * CGlib 测试类
 * @author intlgj
 * @create 2018/8/27
 **/
public class CGlibDynamicProxyClient {
    public static void main(String[] args) {
        //代理类class文件存入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\workplaces\\note");
        Enhancer enhancer = new Enhancer();;
        enhancer.setSuperclass(HelloServiceImpl.class);
        enhancer.setCallback(new HelloMethodInterceptor());
        HelloServiceImpl helloService= (HelloServiceImpl)enhancer.create();
        helloService.sayHello();

    }
}
