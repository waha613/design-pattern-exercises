package com.exercises.adapter;

import com.exercises.adaptee.Encrypt;
import com.exercises.target.DBOperation;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2022-09-15 15:56
 */
public class DBOpertionAdapter implements DBOperation{
    private Encrypt encrypt;

    public DBOpertionAdapter() {
        this.encrypt = new Encrypt();
    }

    @Override
    public String encrypt(String info) {
        return encrypt.encrypt(info);
    }
}
