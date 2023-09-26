package com.primaryKeys.util;

import com.primaryKeys.model.Ankara;
import jakarta.persistence.*;

public class AnkaraCallBack {


    @PrePersist
    @PreUpdate
    public void preinsertOrcreate(Ankara ankara) {

        System.err.println("pre method callade");


    }

    @PostPersist
    @PostLoad
    @PostUpdate
    public void postinsertOrCreate(Ankara ankara) {

        System.err.println("post method callde");
    }
}
