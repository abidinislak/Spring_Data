package com.primaryKeys.util;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NamedId implements Serializable {
    private String name;
    private String lastName;

    public NamedId() {
    }

    public NamedId(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
