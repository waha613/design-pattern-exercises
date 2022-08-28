package com.exercises.hunger;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description  饿汉式
 */
public class HungerSingleton {
    private static final HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance(){
        return instance;
    }
}
