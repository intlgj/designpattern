package com.intl.designpattern.frontController;

/**
 * 处理器：
 * 调度器，用于分配请求
 *
 * @author intlgj
 * @create 2018/1/11
 **/
public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if (request.equalsIgnoreCase("student")){
            studentView.show();
        }else {
            homeView.show();
        }
    }
}
