package com.exercises.factory;

import com.exercises.product.InterfaceController;
import com.exercises.product.OperationController;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description  抽象工厂
 */
public abstract class MobileGameSystem {
    public abstract OperationController createOperationController();
    public abstract InterfaceController createInterfaceController();
}
