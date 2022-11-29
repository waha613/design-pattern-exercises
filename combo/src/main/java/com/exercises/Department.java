package com.exercises;

public class Department implements Component{
    private String name;
    private int peopleNum;

    public Department(String name, int peopleNum) {
        this.name = name;
        this.peopleNum = peopleNum;
    }

    @Override
    public boolean addComponent(Component c) {
        throw new RuntimeException("部门不支持此操作");
    }

    @Override
    public boolean removeComponent(Component c) {
        throw new RuntimeException("部门不支持此操作");
    }

    @Override
    public Component getComponent(int i) {
        throw new RuntimeException("部门不支持此操作");
    }

    @Override
    public int countPerson() {
        return this.peopleNum;
    }

    @Override
    public void issueNotifications() {
        System.out.println(name + "收到通知");
    }
}
