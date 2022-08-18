package com.exercises;

import com.exercises.factory.SimpleFactory;
import com.exercises.product.Graphics;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2022-08-18 19:37
 */
public class Main {

    public static void main(String[] args) {
        Graphics graphics = null;
        graphics = SimpleFactory.getGraphics("circular");
        graphics.draw();
        System.out.println(graphics.getDisplay());
        graphics = SimpleFactory.getGraphics("rectangle");
        graphics.draw();
        System.out.println(graphics.getDisplay());
        graphics = SimpleFactory.getGraphics("triangle");
        graphics.draw();
        System.out.println(graphics.getDisplay());
        graphics = SimpleFactory.getGraphics("asdfjasdf");
        graphics.draw();
        System.out.println(graphics.getDisplay());
    }
}
