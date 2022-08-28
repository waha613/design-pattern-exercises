package com.exercises;

import com.exercises.DeepClone.CustomerPrototypeForDeep;
import com.exercises.shallowClone.CustomerPrototype;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 */
public class Main {
    public static void main(String[] args) {
        CustomerPrototype customerPrototype = new CustomerPrototype();
        CustomerPrototype clone = customerPrototype.clone();
        System.out.println(customerPrototype == clone);
        System.out.println(customerPrototype.getAddress() == clone.getAddress());
        customerPrototype.getAddress().setAddress("珠江");
        System.out.println(clone.getAddress().getAddress());

        CustomerPrototypeForDeep customerPrototypeForDeep = new CustomerPrototypeForDeep();
        CustomerPrototypeForDeep clone1 = customerPrototypeForDeep.clone();
        System.out.println(customerPrototypeForDeep == clone1);
        System.out.println(customerPrototypeForDeep.getAddress() == clone1.getAddress());
    }
}
