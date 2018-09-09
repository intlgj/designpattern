package com.intl.designpattern.proxy;

/**
 * designpattern
 *  静态代理测试
 * @author intlgj
 * @create 2018/8/26
 **/
public class StaticProxyTest {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxySubject = new ProxySubject(subject);
        proxySubject.visit();
    }
}
