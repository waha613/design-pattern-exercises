package com.exercises;

public abstract class DataProcessorAdvice implements DataProcessor{
    private final DataProcessor dataProcessor;

    public DataProcessorAdvice(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    @Override
    public void process(Data data) {
        dataProcessor.process(data);
        advice(data);
    }

    public abstract void advice(Data data);
}
