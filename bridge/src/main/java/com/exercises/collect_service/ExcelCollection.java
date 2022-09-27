package com.exercises.collect_service;

import com.exercises.ThirdApi.ExcelProcess;
import com.exercises.pojo.DataModel;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2022-09-23 16:40
 */
public class ExcelCollection implements DataCollection{
    private final ExcelProcess excelProcess = new ExcelProcess();

    @Override
    public DataModel dataCollection() {
        return excelProcess.excelProcess();
    }
}
