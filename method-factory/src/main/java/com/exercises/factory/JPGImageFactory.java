package com.exercises.factory;

import com.exercises.product.JPGImageLoader;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description  具体工厂方法
 * @date 2022-08-19 11:07
 */
public class JPGImageFactory implements ImageLoaderFactory{
    public void loadImage() {
        new JPGImageLoader().loadImage();
    }
}
