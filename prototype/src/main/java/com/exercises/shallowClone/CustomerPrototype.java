package com.exercises.shallowClone;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 */
public class CustomerPrototype implements Cloneable{
    private Address address = new Address();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public CustomerPrototype clone() {
        try {
            CustomerPrototype clone = (CustomerPrototype) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
