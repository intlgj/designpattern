package com.intl.designpattern.proxy;

/**
 * designpattern
 *
 * @author intlgj
 * @create 2018/8/26
 **/
public class ProxySubject implements Subject {
    private  Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     *
     */
    @Override
    public void visit() {
        checkAuth();
        System.out.println("访问前");
        this.realSubject.visit();
        System.out.println("访问后");
        releaseSource();
    }
    void checkAuth(){
        System.out.println("验证授权");

    }
    void releaseSource(){
        System.out.println("释放资源");
    }
}
