package com.primaryKeys.model;


import com.primaryKeys.util.NamedId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class AuthorComposite {

    @EmbeddedId
    private NamedId namedId;

    private String title;

    public AuthorComposite() {
    }

    public AuthorComposite(NamedId namedId) {
        this.namedId = namedId;
    }

    public NamedId getNamedId() {
        return namedId;
    }

    public void setNamedId(NamedId namedId) {
        this.namedId = namedId;
    }

    public String getTitle() {
        return "select * from CarUUID ";
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
