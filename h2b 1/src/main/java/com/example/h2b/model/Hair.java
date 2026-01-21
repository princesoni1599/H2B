package com.example.h2b.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Hair {
    private String color;
    private String type;

    // Getters and Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hair{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
