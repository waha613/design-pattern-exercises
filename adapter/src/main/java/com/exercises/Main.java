package com.exercises;

import com.exercises.target.DBOperation;
import com.exercises.util.PropertiesUtil;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2022-09-15 16:01
 */
public class Main {
    public static void main(String[] args) {
        DBOperation dbOperation = (DBOperation)PropertiesUtil.getBean();
        String encryptInfo = dbOperation.encrypt("哈哈哈");
        System.out.println(encryptInfo);
    }
}
