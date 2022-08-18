package com.exercises.product;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description 抽象产品类(图形)
 * @date 2022-08-18 19:24
 */
public abstract class Graphics {

    private String display;

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public abstract void draw();

    public abstract void erase();
}
