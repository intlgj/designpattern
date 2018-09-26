package com.intl.designpattern.proxy;

/**
 * designpattern
 * 实现类
 * @author intlgj
 * @create 2018/8/26
 **/
public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.println("real subject");
    }
}
