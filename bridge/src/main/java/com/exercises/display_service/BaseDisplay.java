package com.exercises.display_service;

import com.exercises.collect_service.DataCollection;
import com.exercises.pojo.DataModel;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2022-09-23 16:20
 */
public abstract class BaseDisplay {
    public DataCollection dataCollection;

    public abstract void displayMode(DataModel dataModel);

    public DataCollection getDataCollection() {
        return dataCollection;
    }

    public void setDataCollection(DataCollection dataCollection) {
        this.dataCollection = dataCollection;
    }
}
