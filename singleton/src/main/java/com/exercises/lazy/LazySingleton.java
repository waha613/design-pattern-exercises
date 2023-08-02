package com.exercises.lazy;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description  懒汉式
 */
public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public void dev1Method() {
        System.out.println("dev-1   commit");
    }

    public void devCommit() {
        System.out.println("dev  commit");
    }
}
