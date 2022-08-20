package com.exercises.factory;

import com.exercises.product.IOSInterfaceController;
import com.exercises.product.IOSOperationController;
import com.exercises.product.InterfaceController;
import com.exercises.product.OperationController;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description  具体工厂
 */
public class IOSMobileGame extends MobileGameSystem{
    @Override
    public OperationController createOperationController() {
        return new IOSOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new IOSInterfaceController();
    }
}
