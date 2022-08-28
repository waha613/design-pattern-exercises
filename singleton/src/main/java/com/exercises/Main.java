package com.exercises;

import com.exercises.hunger.HungerSingleton;
import com.exercises.iodh.IoDHSingleton;
import com.exercises.lazy.LazySingleton;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 */
public class Main {
    public static void main(String[] args) {
        HungerSingleton instance1 = HungerSingleton.getInstance();
        HungerSingleton instance2 = HungerSingleton.getInstance();
        HungerSingleton instance3 = HungerSingleton.getInstance();

        if(instance1 == instance2 && instance2 ==instance3){
            System.out.println("饿汉式");
        }

        IoDHSingleton instance4 = IoDHSingleton.getInstance();
        IoDHSingleton instance5 = IoDHSingleton.getInstance();
        IoDHSingleton instance6 = IoDHSingleton.getInstance();

        if(instance4 == instance5 && instance5 ==instance6){
            System.out.println("内部类方式");
        }

        LazySingleton instance7 = LazySingleton.getInstance();
        LazySingleton instance8 = LazySingleton.getInstance();
        LazySingleton instance9 = LazySingleton.getInstance();

        if(instance7 == instance8 && instance8 ==instance9){
            System.out.println("懒汉式");
        }

    }
}
