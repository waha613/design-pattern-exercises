package com.exercises.DeepClone;

import java.io.Serializable;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 */
public class AddressForDeep implements Serializable {
    private String address = "广东";

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
