package com.intl.designpattern.frontController;

/**
 *
 * 前端控制器，统一接收请求
 * @author intlgj
 * @create 2018/1/11
 **/
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }
    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully .");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("请求页面： "+request);
    }

    public void  dispatchRequest(String request){
        //记录请求
        trackRequest(request);
        //校验用户
        if (isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
