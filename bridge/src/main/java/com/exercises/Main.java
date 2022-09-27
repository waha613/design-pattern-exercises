package com.exercises;

import com.exercises.collect_service.DataCollection;
import com.exercises.display_service.BaseDisplay;
import com.exercises.pojo.DataModel;
import com.exercises.util.PropertiesUtil;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2022-09-27 14:43
 */
public class Main {
    public static void main(String[] args) {
        DataCollection dataCollection = (DataCollection)PropertiesUtil.getCollectBean();
        BaseDisplay display = (BaseDisplay)PropertiesUtil.getDisplayBean();
        display.setDataCollection(dataCollection);
        DataModel dataModel = dataCollection.dataCollection();
        display.displayMode(dataModel);
    }
}
