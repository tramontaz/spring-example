package net.chemodurov.tutorials.spring.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "Fidel";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
