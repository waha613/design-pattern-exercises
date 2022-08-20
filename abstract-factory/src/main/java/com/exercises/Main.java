package com.exercises;

import com.exercises.factory.MobileGameSystem;
import com.exercises.product.InterfaceController;
import com.exercises.product.OperationController;
import com.exercises.util.PropertiesUtil;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 */
public class Main {
    public static void main(String[] args) {
        MobileGameSystem mobileGameSystem;
        InterfaceController interfaceController;
        OperationController operationController;

        mobileGameSystem = (MobileGameSystem) PropertiesUtil.getBean();
        interfaceController = mobileGameSystem.createInterfaceController();
        operationController = mobileGameSystem.createOperationController();

        interfaceController.display();
        operationController.display();
    }
}
