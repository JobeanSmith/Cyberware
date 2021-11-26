package com.spring.henallux.cyberware.model;

import javax.validation.constraints.*;

public class Language {
    @NotNull
    private Integer identifier;
    @NotNull
    @Size(max = 30)
    private String name;
    @NotNull
    @Size(max = 30)
    private String imageName;

    public Language() {}

    public Integer getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}