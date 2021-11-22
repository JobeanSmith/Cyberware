package com.spring.henallux.cyberware.model;

import javax.validation.constraints.*;

public class Category {
    @NotNull
    private Integer identifier;
    @Size(max = 400)
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