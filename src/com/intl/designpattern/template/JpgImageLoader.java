package com.intl.designpattern.template;

/**
 * designpattern
 * 具体实现类JpgImageLoader
 * @author intlgj
 * @desc
 * @create 2018/9/14
 **/
public class JpgImageLoader extends AbstractImageLoader {
    @Override
    protected String getUrl(String imageUrl, int width, int height) {
        return String.format("%s?imageView2/1/w/%d/h/%d/format/jpg", imageUrl, width, height);
    }
}
