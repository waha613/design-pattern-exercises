package com.exercises.DeepClone;

import com.exercises.shallowClone.Address;
import com.exercises.shallowClone.CustomerPrototype;

import java.io.*;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 */
public class CustomerPrototypeForDeep implements Serializable {

    private AddressForDeep address = new AddressForDeep();

    public AddressForDeep getAddress() {
        return address;
    }

    public void setAddress(AddressForDeep address) {
        this.address = address;
    }

    public CustomerPrototypeForDeep clone() {
        CustomerPrototypeForDeep customerPrototypeForDeep = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            customerPrototypeForDeep = (CustomerPrototypeForDeep)objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return customerPrototypeForDeep;
    }

}
