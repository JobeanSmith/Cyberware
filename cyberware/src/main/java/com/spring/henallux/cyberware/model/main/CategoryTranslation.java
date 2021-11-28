package com.spring.henallux.cyberware.model.main;

import javax.validation.constraints.*;

public class CategoryTranslation {
    @NotNull
    private Integer identifier;
    @NotNull
    @Size(max = 30)
    private String name;
    @NotNull
    private Category category;
    @NotNull
    private Language language;

    public CategoryTranslation() {}

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

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public Language getLanguage() {
        return language;
    }
    public void setLanguage(Language language) {
        this.language = language;
    }
}