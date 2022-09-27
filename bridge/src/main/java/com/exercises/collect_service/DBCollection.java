package com.exercises.collect_service;

import com.exercises.pojo.DataModel;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2022-09-23 16:34
 */
public class DBCollection implements DataCollection{
    @Override
    public DataModel dataCollection() {
        DataModel dataModel = new DataModel();
        dataModel.setData("db    数据收集");
        return dataModel;
    }
}
