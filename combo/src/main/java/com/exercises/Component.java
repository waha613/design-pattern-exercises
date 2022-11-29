package com.exercises;

public interface Component {
    boolean addComponent(Component c);
    boolean removeComponent(Component c);
    Component getComponent(int i);
    int countPerson();
    void issueNotifications();
}
