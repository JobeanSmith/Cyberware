package com.spring.henallux.cyberware.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @Column(name = "identifier")
    private Integer identifier;
    @Column(name = "description")
    private String description;

    public CategoryEntity() {}

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