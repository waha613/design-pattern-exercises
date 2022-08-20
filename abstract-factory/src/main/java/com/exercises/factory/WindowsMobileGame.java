package com.exercises.factory;

import com.exercises.product.InterfaceController;
import com.exercises.product.OperationController;
import com.exercises.product.WindowsInterfaceController;
import com.exercises.product.WindowsOperationController;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description  具体工厂
 */
public class WindowsMobileGame extends MobileGameSystem{
    @Override
    public OperationController createOperationController() {
        return new WindowsOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsInterfaceController();
    }
}
