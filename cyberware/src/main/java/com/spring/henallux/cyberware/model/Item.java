package com.spring.henallux.cyberware.model;

import javax.validation.constraints.*;

public class Item {
    @NotNull
    private Integer identifier;
    @NotNull
    @Size(max = 30)
    private String name;
    @NotNull
    private Double price;
    @Size(max = 400)
    private String description;
    @NotNull
    @Size(max = 30)
    private String imageName;
    @NotNull
    private Category category;

    public Item() {}

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

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}