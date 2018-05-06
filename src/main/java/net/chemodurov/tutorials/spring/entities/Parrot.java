package net.chemodurov.tutorials.spring.entities;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Kesha";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
