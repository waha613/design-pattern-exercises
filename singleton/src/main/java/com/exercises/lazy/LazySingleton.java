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

    public void dev2Commit() {
        System.out.println("dev2  commit");
    }

    public void dev1Method2() {
      System.out.println("dev-1   commit2");
    }

    public void dev3Commit() {
        System.out.println("dev3  commit");
    }

    public void dev4Commit() {
        System.out.println("dev4  commit");
    }
}
