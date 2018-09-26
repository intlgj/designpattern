package com.intl.designpattern.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * designpattern
 * CGlib  ;l实现MethodInterceptor接口生成方法拦截器
 * @author intlgj
 * @create 2018/8/27
 **/
public class HelloMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //打印入参日志
        StringBuilder builder = new StringBuilder();
        if (args != null) {
            for (int i=0; i<args.length; ++i) {
                builder.append(",arg" + i + "=" + args[i].toString());
            }
        }
        System.out.println("Enter " + method.toString() + ",args:" + builder.toString());

        //Object result = method.invoke(obj, args); //直接使用obj调用方法，会发生和java动态代理一样的无限循环调用
        Object result = methodProxy.invokeSuper(obj, args);

        //打印结果日志
        System.out.println("Leave " + method.toString() + ",result=" + result);

        return null;
    }
}
