package com.exercises;

import com.exercises.factory.GifImageFactory;
import com.exercises.factory.ImageLoaderFactory;
import com.exercises.util.PropertiesUtil;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2022-08-19 10:53
 */
public class Main {
    public static void main(String[] args) {
        ImageLoaderFactory imageLoaderFactory;
        imageLoaderFactory = (ImageLoaderFactory)PropertiesUtil.getBean();
        assert imageLoaderFactory != null;
        imageLoaderFactory.loadImage();
    }
}
