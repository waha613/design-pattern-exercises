package com.exercises;

public class PwdProcess implements DataProcessor{
    @Override
    public void process(Data data) {
        String pwd = data.getPwd();
        System.out.println("对" + pwd + "进行移位加密");
        data.setPwd(pwd + "{位移}");
    }
}
