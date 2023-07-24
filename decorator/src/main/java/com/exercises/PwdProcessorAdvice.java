package com.exercises;

public class PwdProcessorAdvice extends DataProcessorAdvice{
    public PwdProcessorAdvice(DataProcessor dataProcessor) {
        super(dataProcessor);
    }

    @Override
    public void advice(Data data) {
        System.out.println("求模加密");
        data.setPwd(data.getPwd() + "{求模}");
    }
}
