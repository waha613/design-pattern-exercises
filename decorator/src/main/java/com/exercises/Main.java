package com.exercises;

public class Main {
    public static void main(String[] arg) {
        Data data = new Data("111","222");
        DataProcessor dataProcessor = new PwdProcess();
        dataProcessor.process(data);

        DataProcessor dataProcessor1 = new PwdProcessorAdvice(dataProcessor);
        dataProcessor1.process(data);
        System.out.println(data.getPwd());
    }
}
