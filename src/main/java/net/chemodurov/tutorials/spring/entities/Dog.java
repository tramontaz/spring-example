package net.chemodurov.tutorials.spring.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Jara";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
