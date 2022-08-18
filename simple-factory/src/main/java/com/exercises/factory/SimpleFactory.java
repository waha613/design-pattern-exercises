package com.exercises.factory;

import com.exercises.product.Circular;
import com.exercises.product.Graphics;
import com.exercises.product.Rectangle;
import com.exercises.product.Triangle;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description 简单工厂
 * @date 2022-08-18 19:32
 */
public class SimpleFactory {
    public static Graphics getGraphics(String type){
        if ("circular".equals(type)){
            return new Circular();
        }else if ("rectangle".equals(type)){
            return new Rectangle();
        }else if("triangle".equals(type)){
            return new Triangle();
        }else {
            throw new RuntimeException("UnSupportedShapeException");
        }
    }
}
