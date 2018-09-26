package com.intl.designpattern.template;

/**
 * designpattern
 * 下载抽象类
 * @author intlgj
 * @desc
 * @create 2018/9/14
 **/
public abstract class AbstractImageLoader {

    //抽象类定义整个流程骨架
    public final void downloadImage(String imageUrl,int width,int height){
        //先获取最终的数据源URL
        String finalImageUrl=getUrl(imageUrl,width,height);
        System.out.println("imageUrl = [" + imageUrl + "], width = [" + width + "], height = [" + height + "]");
        //然后开始执行下载s
        System.out.println("图片准备下载"+finalImageUrl);


    }
    //以下是不同子类根据自身特性完成的具体步骤
    protected abstract String getUrl(String imageUrl,int width,int height);
}
