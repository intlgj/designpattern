package com.intl.designpattern.frontController;

/**
 * 前端控制器模式（Front Controller Pattern）
 * 提供一种可以集中管理请求的控制器，
 * 即所谓的前端控制器，该前端控制器用于响应客户请求，为每个请求寻找匹配的处理器。
 * 在这种模式中，控制器提供一个处理不同请求的控制点，这些控制点包括日志记录，安全事务，
 * 错误处理和响应内容的生成(如视图)，通过将这些工作集中在一点进行处理，
 * 大大地减低了Java代码量，同时这种机制也可以减少视图模块的程序逻辑，
 * 保证了在 不同请求之间可以重用大量的逻辑代码。
 *
 * 前端控制器模式主要有三类组件构成：
 *  （1）前端控制器：
 *      处理应用程序所有类型请求的单个处理程序，应用程序可以是基于 web 的应用程序，也可以是基于桌面的应用程序
 *  （2）处理器
 *      前端控制器可能使用一个处理器对象来处理请求到相应的具体处理程序
 *  （3）视图
 *      视图是为请求而创建的对象。
 *
 * @author intlgj
 * @create 2018/1/11
 **/
public class FrontControllerPatternDemo {
    public static  void main(String[] args){
        FrontController controller = new FrontController();

        controller.dispatchRequest("HOME");
        controller.dispatchRequest("student");
    }

}
