package com.intl.designpattern.frontController;

/**
 * ${DESCRIPTION}
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
