package com.spring.henallux.cyberware.model.main;

import javax.validation.constraints.*;

public class Language {
    private Integer identifier;
    @NotNull
    @Size(min = 1, max = 30)
    private String name;
    @NotNull
    @Size(min = 1, max = 30)
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