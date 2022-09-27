package com.exercises.display_service;

import com.exercises.collect_service.DataCollection;
import com.exercises.pojo.DataModel;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2022-09-27 14:22
 */
public class LineChartDisplay extends BaseDisplay{

    @Override
    public void displayMode(DataModel dataModel) {
        System.out.println("折线图展示：" + dataModel.getData());
    }
}
