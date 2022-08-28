package com.exercises.shallowClone;

import java.io.Serializable;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 */
public class Address implements Serializable {
    private String address = "厦门";

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
