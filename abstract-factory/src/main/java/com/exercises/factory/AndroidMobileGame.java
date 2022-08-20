package com.exercises.factory;

import com.exercises.product.AndroidInterfaceController;
import com.exercises.product.AndroidOperationController;
import com.exercises.product.InterfaceController;
import com.exercises.product.OperationController;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description  具体工厂
 */
public class AndroidMobileGame extends MobileGameSystem{
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
