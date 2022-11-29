package com.exercises;

import com.exercises.Component;
import java.util.ArrayList;
import java.util.List;

public class Company implements Component {
    private String name;
    private final List<Component> components = new ArrayList<>();
    @Override
    public boolean addComponent(Component c) {
        return components.add(c);
    }

    @Override
    public boolean removeComponent(Component c) {
        return components.remove(c);
    }

    @Override
    public Component getComponent(int i) {
        return components.get(i);
    }

    @Override
    public int countPerson() {
        int count = 0;
        for (Component component : components) {
            count += component.countPerson();
        }
        return count;
    }

    @Override
    public void issueNotifications() {
        for (Component component : components) {
            component.issueNotifications();
            System.out.println(name + "已下发通知");
        }
    }

    public Company(String name) {
        this.name = name;
    }
}
