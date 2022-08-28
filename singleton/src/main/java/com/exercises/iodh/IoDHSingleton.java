package com.exercises.iodh;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description  内部类方式
 */
public class IoDHSingleton {

    private IoDHSingleton() {
    }

    private static class Singleton{
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance(){
        return Singleton.instance;
    }
}
