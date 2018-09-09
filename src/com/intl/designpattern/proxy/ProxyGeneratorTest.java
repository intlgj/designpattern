package com.intl.designpattern.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * designpattern
 *
 * @author intlgj
 * @create 2018/8/26
 **/
public class ProxyGeneratorTest {
    public static void main(String[] args) {
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", RealSubject.class.getInterfaces());
        String path = "E:\\workplaces\\note\\RealSubjectProxy.class";
        try(FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(classFile);
            fos.flush();
            System.out.println("代理类class文件写入成功");
        } catch (Exception e) {
            System.out.println("写文件错误");
        }
    }
}
