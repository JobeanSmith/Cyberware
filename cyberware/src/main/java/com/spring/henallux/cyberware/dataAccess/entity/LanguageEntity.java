package com.spring.henallux.cyberware.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name = "language")
public class LanguageEntity {
    @Id
    @Column(name = "identifier")
    private Integer identifier;
    @Column(name = "name")
    private String name;

    public LanguageEntity() {}

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
}