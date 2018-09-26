package com.intl.designpattern.singleton;
/**
 * 用静态内部类实现，跟以上方法最大的区别是没有synchronized关键字，这在多并发系统中很重要，而且My.single的线程安全的
 * @author JC
 * @create 20180916
 */
public class Singleton2 {
    private Singleton2(){
        System.out.println("create singleton2");
    }
    private static class My{
        private  static final Singleton2 single = new Singleton2();
    }
    public static final Singleton2 getInstance(){
        return My.single;
    }
}
