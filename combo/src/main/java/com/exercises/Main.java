package com.exercises;

public class Main {
    public static void main(String[] args) {
        Component yinzhou = new Company("yinzhou");
        Component jiangbei = new Company("jiangbei");
        Component mobileBank = new Department("yinzhoumobileBank",10);
        Component mobileBank1 = new Department("jiangbeimobileBank",15);
        Component webBank = new Department("yinzhouwebBank",17);
        Component webBank1 = new Department("jiangbeiwebBank",8);
        Component nbbank = new Company("nbbank");
        nbbank.addComponent(yinzhou);
        nbbank.addComponent(jiangbei);
        yinzhou.addComponent(mobileBank);
        yinzhou.addComponent(webBank);
        jiangbei.addComponent(mobileBank1);
        jiangbei.addComponent(webBank1);

        int i = nbbank.countPerson();
        System.out.println("nbbank 人数：" + i);

        int i1 = yinzhou.countPerson();
        System.out.println("yinzhou 人数:" + i1);

        int i2 = jiangbei.countPerson();
        System.out.println("jiangbei  人数:" + i2);

        nbbank.issueNotifications();
    }
}
