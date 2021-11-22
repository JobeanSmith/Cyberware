package com.spring.henallux.cyberware.model;

public class Category {
    private Integer identifier;
    private String description;

    public Category() {}

    public Integer getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}