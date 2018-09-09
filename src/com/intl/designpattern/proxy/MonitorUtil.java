package com.intl.designpattern.proxy;

/**
 * designpattern
 * 计算执行时间的方法
 * @author intlgj
 * @create 2018/8/26
 **/
public class MonitorUtil {
    private static ThreadLocal<Long> tl = new ThreadLocal();

    public static void start() {
        tl.set(System.currentTimeMillis());
    }

    //结束时打印耗时
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - tl.get()) + "ms");
    }
}
